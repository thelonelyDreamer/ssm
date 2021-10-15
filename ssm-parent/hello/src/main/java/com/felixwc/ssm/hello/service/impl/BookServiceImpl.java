package com.felixwc.ssm.hello.service.impl;

import com.felixwc.ssm.hello.mapper.BookMapper;
import com.felixwc.ssm.hello.pojo.Books;
import com.felixwc.ssm.hello.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/10 16:04
 *
 * @author wangchao
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    @Override
    public int deleteBooksById(Integer id) {
        return bookMapper.deleteBooksById(id);
    }

    @Override
    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    @Override
    public Books queryBooksById(Integer id) {
        return bookMapper.queryBooksById(id);
    }

    @Override
    public List<Books> queryAll() {
        return bookMapper.queryAll();
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }
}
