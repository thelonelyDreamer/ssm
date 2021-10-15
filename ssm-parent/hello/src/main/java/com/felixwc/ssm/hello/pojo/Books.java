package com.felixwc.ssm.hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/3/10 15:37
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Books {
    private long bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
