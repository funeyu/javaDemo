package com.funer.entity;

import java.sql.Timestamp;

/**
 * Created by fuheyu on 2017/10/23.
 */
public class Book {

    private Long seckillId;

    private String name;

    private Integer number;

    private Timestamp startTime;

    private Timestamp endTime;

    private Timestamp createTime;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getName() {

        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }
}
