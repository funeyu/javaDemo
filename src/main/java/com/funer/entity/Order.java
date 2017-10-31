package com.funer.entity;

/**
 * Created by fuheyu on 2017/10/31.
 */
public class Order {

    private int id;

    private String buyer;

    private String remark;

    private Book book;


    public Order(int id, String buyer, String remark) {
        this.id = id;
        this.buyer = buyer;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
