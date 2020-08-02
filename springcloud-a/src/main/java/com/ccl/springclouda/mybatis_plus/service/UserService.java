package com.ccl.springclouda.mybatis_plus.service;

import com.ccl.springclouda.mybatis_plus.entity.User;
import com.ccl.springclouda.mybatis_plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> list(){
       return userMapper.selectList(null);
    }



}
