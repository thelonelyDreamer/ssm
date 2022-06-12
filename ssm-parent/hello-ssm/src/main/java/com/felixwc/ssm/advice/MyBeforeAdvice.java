package com.felixwc.ssm.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * in order to learn java!
 * created at 2021/8/17 15:39
 *
 * @author wangchao
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before advice");
    }
}
