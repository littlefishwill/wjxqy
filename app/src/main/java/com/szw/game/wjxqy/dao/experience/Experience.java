package com.szw.game.wjxqy.dao.experience;

import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by shenmegui on 2017/11/29.
 */
public class Experience {

    /**
     * 用户id
     */
    @PrimaryKey(AssignType.BY_MYSELF)
    private int userid;

    /**
     * 等级
     */
    @NotNull
    private int level;

    /**
     *最高等级
     */
    @NotNull
    private int maxLevel;

    /**
     * 战斗力
     */
    @NotNull
    private int effective;

    /**
     *累计经验
     */
    @NotNull
    private long experience;

    /**
     *今日经验
     */
    @NotNull
    private long experienceToday;

    /**
     *今日经验
     */
    @NotNull
    private long maxExperienceToday;
}
