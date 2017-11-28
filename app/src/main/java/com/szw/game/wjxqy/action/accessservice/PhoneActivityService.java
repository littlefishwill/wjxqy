package com.szw.game.wjxqy.action.accessservice;

import android.accessibilityservice.AccessibilityService;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;

import com.szw.game.wjxqy.R;
import com.szw.game.wjxqy.frame.WjxqyAppliaciton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shenmegui on 2017/9/15.
 */
public class PhoneActivityService extends AccessibilityService {
    public static String TAG ="PhoneActivityService";
    public static Map <String,Long> controlList = new HashMap<String,Long>();

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {


    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Toast.makeText(WjxqyAppliaciton.getInstance(),getString(R.string.access_service_connect),Toast.LENGTH_LONG)
                .show();
    }

    /**
     * 微信聊天记录监听
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void wechatTell(AccessibilityEvent event) {
        String className = event.getClassName().toString();
        //判断是否是微信聊天界面
        if ("com.tencent.mm".equals(event.getPackageName())) {
            //获取当前聊天页面的根布局
            AccessibilityNodeInfo rootNode = getRootInActiveWindow();
            // 微信首页 第一个元素为资第一 view.，聊天界面第一个节点为linnerlayout
            if(rootNode!=null && className.equals("android.widget.ListView") && rootNode.getChildCount()>0 && rootNode.getChild(0).getClassName().toString().equals("android.widget.LinearLayout")) {
//                //查询聊天对象名称
//                getWeChatTellRecode(rootNode);
//                //聊天记录 回传
//                getChatRecord(rootNode);
            }else{
//                sendText("微信:聊天界面获取根节点失败");
            }
        }
    }

//    /**
//     * 监控 窗口变化
//     * @param event
//     */
//    private void controlActivityChange(AccessibilityEvent event) {
//        if(lastCacheName.equals(event.getPackageName().toString())){
//            return;
//        }
//        String appInfoByPackageName = Utils.getAppInfoByPackageName(ControlApplication.context, event.getPackageName().toString());
//        sendText(appInfoByPackageName);
//
//        lastCacheName = event.getPackageName().toString();
//
//    }

    @Override
    public void onInterrupt() {

    }

    public static boolean isAccessibilitySettingsOn(Context mContext) {
        int accessibilityEnabled = 0;
        final String service = "com.szw.tools.wechatgroupandroid/com.szw.tools.wechatgroupandroid.service.PhoneActivityService";
        boolean accessibilityFound = false;
        try {
            accessibilityEnabled = Settings.Secure.getInt(
                    mContext.getApplicationContext().getContentResolver(),
                    Settings.Secure.ACCESSIBILITY_ENABLED);
            Log.v(TAG, "accessibilityEnabled = " + accessibilityEnabled);
        } catch (Settings.SettingNotFoundException e) {
            Log.e(TAG, "Error finding setting, default accessibility to not found: "
                    + e.getMessage());
        }
        TextUtils.SimpleStringSplitter mStringColonSplitter = new TextUtils.SimpleStringSplitter(':');

        if (accessibilityEnabled == 1) {
            Log.v(TAG, "***ACCESSIBILIY IS ENABLED*** -----------------");
            String settingValue = Settings.Secure.getString(
                    mContext.getApplicationContext().getContentResolver(),
                    Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES);
            if (settingValue != null) {
                TextUtils.SimpleStringSplitter splitter = mStringColonSplitter;
                splitter.setString(settingValue);
                while (splitter.hasNext()) {
                    String accessabilityService = splitter.next();

                    Log.v(TAG, "-------------- > accessabilityService :: " + accessabilityService);
                    if (accessabilityService.equalsIgnoreCase(service)) {
                        Log.v(TAG, "We've found the correct setting - accessibility is switched on!");
                        return true;
                    }
                }
            }
        } else {
            Log.v(TAG, "***ACCESSIBILIY IS DISABLED***");
        }

        return accessibilityFound;
    }



    public void sendText(String text){
//        Iterator<Map.Entry<String, Long>> iterator = controlList.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Long> next = iterator.next();
//            EMMessage message = EMMessage.createTxtSendMessage(text, next.getKey());
//            //发送消息
//            EMClient.getInstance().chatManager().sendMessage(message);
//        }

    }

    public void sendText(String text,String to){
//        EMMessage message = EMMessage.createTxtSendMessage(text, to);
//        //发送消息
//        EMClient.getInstance().chatManager().sendMessage(message);
    }

}
