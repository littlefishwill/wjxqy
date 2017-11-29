package com.szw.game.wjxqy;

import android.content.Intent;
import android.provider.Settings;
import com.szw.game.wjxqy.action.accessservice.PhoneActivityService;
import com.szw.game.wjxqy.dao.broad.SplashWatiTime;
import com.szw.game.wjxqy.frame.BaseActivity;
import com.szw.game.wjxqy.ui.pages.MainAvtivity;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class SplashActivity extends BaseActivity {

    private SweetAlertDialog accessDialog;

    @Override
    protected int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void logic() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                    boolean accessibilitySettingsOn = PhoneActivityService
                            .isAccessibilitySettingsOn(SplashActivity.this);
                    EventBus.getDefault().post(new SplashWatiTime(accessibilitySettingsOn));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCantAccessService(SplashWatiTime event) {
        Intent gotoMain = new Intent(this, MainAvtivity.class);
        startActivity(gotoMain);
//        if(event.isServiceCanAccess()){
//            Intent gotoMain = new Intent(this, MainAvtivity.class);
//            startActivity(gotoMain);
//        }else{
//            accessDialog = new SweetAlertDialog(this, SweetAlertDialog
//                    .ERROR_TYPE)
//                    .setTitleText(getString(R.string.error_title_access_service_notaccess))
//                    .setContentText(getString(R.string.error_body_access_service_notaccess))
//                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
//                        @Override
//                        public void onClick(SweetAlertDialog sweetAlertDialog) {
//                            startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
//                            accessDialog.cancel();
//                        }
//                    });
//            accessDialog.show();
//        }
    }
}
