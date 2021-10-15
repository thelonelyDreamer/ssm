package com.felixwc.ssm.hello.service;


import com.felixwc.ssm.hello.pojo.Books;

import java.util.List;

public interface BookService {

    // 增加一种书
    int addBooks(Books books);
    // 删除一种书
    int deleteBooksById(Integer id);
    // 更新一种书
    int updateBooks(Books books);
    // 查询一种书
    Books queryBooksById( Integer id);
    // 查询全部的书
    List<Books> queryAll();
}
