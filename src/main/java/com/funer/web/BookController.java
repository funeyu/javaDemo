package com.funer.web;

import com.alibaba.fastjson.JSON;
import com.funer.entity.Book;
import com.funer.entity.Order;
import com.funer.service.BookService;
import com.funer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fuheyu on 2017/10/23.
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    @ResponseBody
    public String listAll() {

        List<Book> books = bookService.list();
        return JSON.toJSONString(books);
    }

    @RequestMapping(value="/one", method = RequestMethod.GET)
    @ResponseBody
    public String order() {

        List<Order> orders = orderService.clasify();
        return JSON.toJSONString(orders);
    }


}
