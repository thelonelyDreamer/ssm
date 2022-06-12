package com.felixwc.mybatis22.dao.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class SchoolMapperTest {
    @Autowired
    private SchoolMapper mapper;
    @Test
    public void test1() {
        System.out.println(mapper.getById(1L));
    }

    @Test
    public void test2() {
        System.out.println(mapper.getByIds());
    }

    @Test
    public void test3() {
        System.out.println(mapper.getAddress(1L));
    }
}