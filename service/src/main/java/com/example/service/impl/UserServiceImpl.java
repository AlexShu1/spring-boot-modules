package com.example.service.impl;


import com.example.bean.mybatis.User;
import com.example.daomybatis.mapper.UserMapper;
import com.example.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    private List<User> userList;

    @Override
    public List<User> findAll() {
        PageHelper.startPage(2,2); //pageNum=2, pageSize=3 ,表示每页的大小为3，查询第二页的结果
        PageHelper.orderBy("id ASC "); //进行分页结果的排序，name为字段名，排序规则DESC/ASC
        userList=userMapper.findAll();
        log.info("UserImpl findAll");
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        return pageInfo.getList();
    }

    @Override
    public void add(User user) {
        log.info("UserImpl add");
        userMapper.add(user);
    }
}
