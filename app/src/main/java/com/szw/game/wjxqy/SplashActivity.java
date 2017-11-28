package com.szw.game.wjxqy;

import com.szw.game.wjxqy.action.accessservice.PhoneActivityService;
import com.szw.game.wjxqy.dao.broad.SplashWatiTime;
import com.szw.game.wjxqy.frame.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void logic() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
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
    public void onMessageEvent(SplashWatiTime event) {
        if(event.isServiceCanAccess()){

        }else{

        }
    }
}
