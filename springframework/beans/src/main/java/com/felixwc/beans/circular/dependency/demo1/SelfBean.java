package com.felixwc.beans.circular.dependency.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2021/12/12 13:05
 *
 * @author wangchao
 */
@Component
public class SelfBean {
    private SelfBean selfBean;

    @Autowired
    public SelfBean setSelfBean(SelfBean selfBean) {
        this.selfBean = selfBean;
        return this;
    }

}
