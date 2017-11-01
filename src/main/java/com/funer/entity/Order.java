package com.funer.entity;

/**
 * Created by fuheyu on 2017/10/31.
 */
public class Order {

    private Integer id;

    private String buyer;

    private String remark;

    private Long seckillId;

    private Book book;


    public Integer getId() {
        return id;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getRemark() {
        return remark;
    }

    public Long getSeckillId() { return seckillId; }


    public Book getBook() { return book; }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSeckillId(Long seckillId) { this.seckillId = seckillId; }

    public void setBook(Book book) { this.book = book; }

}
