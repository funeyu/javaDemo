package com.funer.dao;

import com.funer.entity.Order;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fuheyu on 2017/10/31.
 */
@Repository
public interface OrderDao {

    @Select("select o.id, o.buyer, o.remark, o.seckill_id from orders o, seckill s where o.seckill_id = s.seckill_id")
    @ResultMap("com.funer.dao.OrderDao.order")
    List<Order> clasify();
}
