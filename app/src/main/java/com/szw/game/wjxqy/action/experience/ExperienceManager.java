package com.szw.game.wjxqy.action.experience;

import com.szw.game.wjxqy.dao.experience.Experience;
import com.szw.game.wjxqy.dao.user.User;
import com.szw.game.wjxqy.frame.Manager;

/**
 * Created by shenmegui on 2017/11/29.
 */
public class ExperienceManager extends Manager {

    private  static  ExperienceManager experienceManager;

    public static ExperienceManager getInstance(){
        if(experienceManager==null){
            experienceManager = new ExperienceManager();
        }
        return experienceManager;
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
