package com.felixwc.ssm.hello.mapper;


import com.felixwc.ssm.hello.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // 增加一种书
    int addBooks(Books books);
    // 删除一种书
    int deleteBooksById(@Param("bookId")Integer id);
    // 更新一种书
    int updateBooks(Books books);
    // 查询一种书
    Books queryBooksById(@Param("bookId") Integer id);
    // 查询全部的书
    List<Books> queryAll();

    //模糊查询


}
