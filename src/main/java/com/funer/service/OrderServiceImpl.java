package com.funer.service;

import com.funer.dao.OrderDao;
import com.funer.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fuheyu on 2017/10/31.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> clasify(int id) {

        return orderDao.clasify(id);
    }
}
