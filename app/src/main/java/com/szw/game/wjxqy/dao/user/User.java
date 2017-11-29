package com.szw.game.wjxqy.dao.user;

import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;
import com.szw.game.wjxqy.dao.experience.Experience;

/**
 * Created by shenmegui on 2017/11/29.
 */
@Table("user")
public class User {
    /**
     * 用户id
     */
    @PrimaryKey(AssignType.BY_MYSELF)
    private int userid;

    /**
     * 用户名
     */
    @NotNull
    private int name;

    /**
     * 性别 1=男，2=女
     */
    @NotNull
    private int sex;

    /**
     * 等级与经验
     */
    private Experience experience;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
