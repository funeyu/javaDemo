package com.funer.service;

import com.funer.dao.BookDao;
import com.funer.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fuheyu on 2017/10/23.
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> list() {

        return bookDao.queryAll();
    }
}
