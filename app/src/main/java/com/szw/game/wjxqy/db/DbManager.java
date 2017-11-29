package com.szw.game.wjxqy.db;

import android.database.Cursor;
import com.litesuits.orm.LiteOrm;
import com.szw.game.wjxqy.frame.Manager;
import com.szw.game.wjxqy.frame.WjxqyAppliaciton;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by shenmegui on 2017/9/29.
 */
public class DbManager extends Manager {
    private static DbManager dbManager;
    public  LiteOrm liteOrm;

    public static DbManager getInstance(){
        if(dbManager==null){
            dbManager = new DbManager();
        }
        return  dbManager;
    }

    private DbManager() {
        init();
    }

    @Override
    public String getSpNameSpec() {
        return null;
    }

    @Override
    public void init() {
        if (liteOrm == null) {
//            DataBaseConfig dataBaseConfig = new DataBaseConfig(WeChatAdnroidGroup.getInstance());
//            dataBaseConfig.dbName = "liteorm.db";
//            dataBaseConfig.dbVersion = 101;
//            dataBaseConfig.debugged = true;
//            this.liteOrm  = LiteOrm.newCascadeInstance(dataBaseConfig);
            this.liteOrm = LiteOrm.newSingleInstance(WjxqyAppliaciton.getInstance(), "wjxqy.db");
        }
        liteOrm.setDebugged(true); // open the log
    }

    public LiteOrm getLiteOrm() {
        return liteOrm;
    }

}
