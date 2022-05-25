package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2022/4/21 17:27
 *
 * @author felixwc
 */
@RequestMapping("/response")
@Controller
public class ResponseController {
    @RequestMapping("/test")
    public String test(HttpServletResponse response) throws IOException {
        response.getWriter().println(1);
        return "test";
    }
}
