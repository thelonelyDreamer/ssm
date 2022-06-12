package com.felixwc.mybatis22.pojo.dbo;

import com.felixwc.mybatis22.enums.DeletedFlag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/19 18:31
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class School {
    private long id;
    private String name;
    private Address address;
    private Date createdTime;
    private Date updatedTime;
    private DeletedFlag deletedFlag;
    private List<Teacher> teachers;
}
