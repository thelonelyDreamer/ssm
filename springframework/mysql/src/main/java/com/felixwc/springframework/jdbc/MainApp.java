package com.felixwc.springframework.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2021/12/12 15:24
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
