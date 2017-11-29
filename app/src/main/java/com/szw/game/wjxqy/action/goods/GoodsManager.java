package com.szw.game.wjxqy.action.goods;

import com.szw.game.wjxqy.dao.experience.Experience;
import com.szw.game.wjxqy.dao.user.User;
import com.szw.game.wjxqy.frame.Manager;

/**
 * Created by shenmegui on 2017/11/29.
 */
public class GoodsManager extends Manager {

    private  static GoodsManager goodsManager;

    public static GoodsManager getInstance(){
        if(goodsManager==null){
            goodsManager = new GoodsManager();
        }
        return goodsManager;
    }

    @Override
    public String getSpNameSpec() {
        return null;
    }

    @Override
    public void init() {

    }

    public Experience getExperience(User user){
        return null;
    }


}
