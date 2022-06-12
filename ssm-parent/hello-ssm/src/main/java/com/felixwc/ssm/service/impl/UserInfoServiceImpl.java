package com.felixwc.ssm.service.impl;

import com.felixwc.ssm.mapper.UserMapper;
import com.felixwc.ssm.pojo.data.User;
import com.felixwc.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/17 14:53
 *
 * @author wangchao
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private final UserMapper mapper;

    @Autowired
    public UserInfoServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED)
    public List<User> getAll() {
        return mapper.getUsers();
    }
}
