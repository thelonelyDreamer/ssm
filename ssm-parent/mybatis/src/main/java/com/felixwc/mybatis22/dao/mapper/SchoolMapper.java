package com.felixwc.mybatis22.dao.mapper;

import com.felixwc.mybatis22.pojo.dbo.Address;
import com.felixwc.mybatis22.pojo.dbo.School;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/19 18:36
 *
 * @author wangchao
 */
@Mapper
public interface SchoolMapper {

    School getById(@Param("id")Long id);

    @Results(id = "address",value = {
            @Result(property = "detailAddress",column = "school_detail_address"),
            @Result(property = "zone",column = "school_zone")
    })
    @Select("select school_detail_address,school_zone from t_school where school_id=#{id}")
    Address getAddress(@Param("id") Long id);

    @Results(id = "school",value = {
            @Result(property = "id",column = "school_id"),
            @Result(property = "name",column = "school_name"),
            @Result(property = "createdTime",column = "created_time"),
            @Result(property = "updatedTime",column = "updated_time"),
            @Result(property = "deletedFlag",column = "deleted_flag"),
            @Result(property = "address.zone",column = "school_zone"),
            @Result(property = "address.detailAddress",column = "school_detail_address")
    })
    @Select("select school_id,school_name,school_zone,school_detail_address,\n" +
            "created_time,updated_time,deleted_flag\n" +
            "from t_school")
    List<School> getByIds();
}
