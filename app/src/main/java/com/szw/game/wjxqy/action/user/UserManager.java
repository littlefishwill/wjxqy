package com.szw.game.wjxqy.action.user;

import com.szw.game.wjxqy.dao.user.User;
import com.szw.game.wjxqy.db.DbManager;
import com.szw.game.wjxqy.frame.Manager;
import java.util.List;

/**
 * Created by shenmegui on 2017/11/29.
 */
public class UserManager extends Manager {

    private  static  UserManager userManager;

    public static UserManager getInstance(){
        if(userManager==null){
            userManager = new UserManager();
        }
        return userManager;
    }

    @Override
    public String getSpNameSpec() {
        return null;
    }

    @Override
    public void init() {

    }

    public List<User> getUsers(){
        return null;
    }

    public User getUser(int userId){
        User user = DbManager.getInstance().liteOrm.queryById(userId + "", User.class);



        return user;
    }
}
