package com.szw.game.wjxqy.dao.broad;

/**
 * Created by shenmegui on 2017/11/28.
 */
public class SplashWatiTime {
    public SplashWatiTime(boolean isServiceCanAccess) {
        this.isServiceCanAccess = isServiceCanAccess;
    }

    private boolean isServiceCanAccess;

    public boolean isServiceCanAccess() {
        return isServiceCanAccess;
    }

    public void setServiceCanAccess(boolean serviceCanAccess) {
        isServiceCanAccess = serviceCanAccess;
    }
}
