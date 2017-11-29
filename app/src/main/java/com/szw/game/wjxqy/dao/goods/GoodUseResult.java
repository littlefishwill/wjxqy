package com.szw.game.wjxqy.dao.goods;

/**
 * Created by shenmegui on 2017/11/29.
 */
public class GoodUseResult {
    private boolean isSuccess;
    private String msg;
    private int code;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
