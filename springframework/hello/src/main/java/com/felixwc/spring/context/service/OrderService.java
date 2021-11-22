package com.felixwc.spring.context.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * in order to learn java!
 * created at 2021/11/22 16:04
 *
 * @author wangchao
 */
@Service
public class OrderService {
    private String s;

    @Async
    public void test(){
        System.out.println("async");
    }

    @Async
    public Future<String> test2(){
        Future<String> future;
        future = new AsyncResult<>("s");
        return future;
    }
}
