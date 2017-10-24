package com.funer.dao;

import com.funer.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fuheyu on 2017/10/23.
 */
@Repository
public interface BookDao {

    @Select("select * from seckill where seckillId = #{seckillId}")
    Book queryById(@Param("seckillId") int seckillId);

    @Select("select * from seckill")
    List<Book> queryAll();
}
