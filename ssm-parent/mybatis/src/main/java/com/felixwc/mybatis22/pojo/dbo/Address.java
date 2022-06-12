package com.felixwc.mybatis22.pojo.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/8/19 18:34
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Address {
    private String zone;
    private String detailAddress;
}
