package com.felixwc.ssm.mapper;

import com.felixwc.ssm.pojo.data.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUsers();
}
