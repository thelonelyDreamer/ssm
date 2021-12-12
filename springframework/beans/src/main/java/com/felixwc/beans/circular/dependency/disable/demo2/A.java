package com.felixwc.beans.circular.dependency.disable.demo2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2021/12/12 13:16
 *
 * @author wangchao
 */
@Component
@AllArgsConstructor
public class A {
    private B b;
}
