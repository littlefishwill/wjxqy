package com.szw.game.wjxqy.dao.goods;

/**
 * Created by shenmegui on 2017/11/29.
 */
public abstract class Goods {
    /**
     * 物品数量
     */
    private int number;
    /**
     * 物品名称
     */
    private String name;

    /**
     * 物品图标
     */
    private int goodsIco;

    /**
     * 使用
     * @param number
     */
    protected abstract GoodUseResult use(int number);

    /**
     * 丢弃
     * @param number
     * @return
     */
    protected abstract GoodUseResult giveUp(int number);


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoodsIco() {
        return goodsIco;
    }

    public void setGoodsIco(int goodsIco) {
        this.goodsIco = goodsIco;
    }
}
