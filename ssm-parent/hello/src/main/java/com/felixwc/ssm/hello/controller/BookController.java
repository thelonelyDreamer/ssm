package com.felixwc.ssm.hello.controller;

import com.felixwc.ssm.hello.pojo.Books;
import com.felixwc.ssm.hello.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/10 16:56
 *
 * @author wangchao
 */
@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/all-book")
    public String listAll(Model model){
        List<Books> books = bookService.queryAll();
        books.stream().forEach(System.out::println);
        model.addAttribute("list",books);
        return "allBook";
    }
}
