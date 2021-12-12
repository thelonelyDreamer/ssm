package com.felixwc.beans.circular.dependency.disable.demo1;

import lombok.Data;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2021/12/12 13:16
 *
 * @author wangchao
 */
@Component
@Data
@DependsOn("a")
public class B {
    private A a;
}
