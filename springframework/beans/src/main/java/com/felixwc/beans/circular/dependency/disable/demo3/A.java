package com.felixwc.beans.circular.dependency.disable.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2021/12/12 13:16
 *
 * @author wangchao
 */
@Component
@Scope(value = "prototype" )
public class A {
    private B b;

    @Autowired
    public A setB(B b) {
        this.b = b;
        return this;
    }
}
