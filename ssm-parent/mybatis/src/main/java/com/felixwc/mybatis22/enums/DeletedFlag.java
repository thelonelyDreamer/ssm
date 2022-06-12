package com.felixwc.mybatis22.enums;

import lombok.AllArgsConstructor;

/**
 * in order to learn java!
 * created at 2021/8/19 21:18
 *
 * @author wangchao
 */
@AllArgsConstructor
public enum  DeletedFlag {
    ACTIVE(0,"active"),DELETED(1,"deleted");
    private int code;
    private String description;

}
