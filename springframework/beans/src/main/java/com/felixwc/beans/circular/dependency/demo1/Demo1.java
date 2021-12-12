package com.felixwc.beans.circular.dependency.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2021/12/12 13:04
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo1Config.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}