package com.example.service;

import com.example.bean.mybatis.User;

import java.util.List;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
public interface IUserService {

    List<User> findAll();


    void add(User user);
}
