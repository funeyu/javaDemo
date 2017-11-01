package com.funer.dao;

import com.funer.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fuheyu on 2017/10/31.
 */
@Repository
public interface OrderDao {

    List<Order> clasify(@Param("id") int id);
}
