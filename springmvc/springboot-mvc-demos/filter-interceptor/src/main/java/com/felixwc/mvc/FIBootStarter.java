package com.felixwc.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/6/15 17:48
 *
 * @author felixwc
 */
@SpringBootApplication
public class FIBootStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FIBootStarter.class, args);
        String[] beanNamesForType = context.getBeanNamesForType(HandlerInterceptor.class);
        Arrays.stream(beanNamesForType).forEach(System.out::println);
    }
}
