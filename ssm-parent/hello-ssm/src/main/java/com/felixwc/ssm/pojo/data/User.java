package com.felixwc.ssm.pojo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * in order to learn java!
 * created at 2021/8/17 14:35
 *
 * @author wangchao
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
   private int id;
   private String name;
   private String address;
}
