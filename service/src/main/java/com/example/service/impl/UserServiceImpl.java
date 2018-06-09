package com.example.service.impl;


import com.example.bean.User;
import com.example.dao.mapper.UserMapper;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        System.out.println("UserImpl findAll");
        return userMapper.findAll();
    }
}
