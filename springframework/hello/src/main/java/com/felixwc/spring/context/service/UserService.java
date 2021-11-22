package com.felixwc.spring.context.service;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * in order to learn java!
 * created at 2021/11/22 15:40
 *
 * @author wangchao
 */
/*
    拿到类名 无参构造 实例化对象 依赖注入 初始化前 初始化 初始化后(aop) 代理对象 bean
    一个类有一个构造
    多个 找无参

 */
@Service
@Data
public class UserService implements InitializingBean {
    @Autowired
    private OrderService orderService;

    public UserService() {
        System.out.println("0");
    }
    public UserService(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("1");
    }

    @PostConstruct
    public void xxx(){
        System.out.println("初始化前");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }

    public void test(){
        orderService.test();
        Future<String> future = orderService.test2();
        try {
            String s = future.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("UserService test");
    }
}
