package com.szw.game.wjxqy.frame;

import android.app.Application;

/**
 * Created by shenmegui on 2017/9/21.
 */
public class WjxqyAppliaciton extends Application {
    private static WjxqyAppliaciton weChatAdnroidGroup;
    public static WjxqyAppliaciton getInstance(){
        return weChatAdnroidGroup;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        weChatAdnroidGroup = this;
    }

}
