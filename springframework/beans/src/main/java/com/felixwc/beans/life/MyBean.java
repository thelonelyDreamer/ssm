package com.felixwc.beans.life;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * in order to learn java!
 * created at 2022/3/16 18:01
 *
 * @author wangchao
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyBean implements InitializingBean {
    private  String name;
    {
        System.out.println("这是匿名代码块");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行 InitializingBean 的 afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("执行 postConstruct()方法");
    }
}
