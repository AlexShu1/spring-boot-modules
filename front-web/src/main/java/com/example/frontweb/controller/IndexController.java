package com.example.frontweb.controller;

import com.example.bean.Email;
import com.example.bean.ResultUtil;
import com.example.bean.mybatis.User;
import com.example.daojpa.UserJPA;
import com.example.service.IMailService;
import com.example.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Controller
@Api(value = "测试Controller",tags = "测试Controller",description="简单的API")
public class IndexController {

    @Resource
    private IUserService userService;

    @Resource
    private IMailService mailService;
    @Resource
    private UserJPA userJPA;

    @GetMapping("/mybatis")
    @ApiOperation(value = "测试Mybatis查询用户", notes = "查询所有用户")
    @ResponseBody
    public Object test(){
        return ResultUtil.success( userService.findAll());
    }

    @PostMapping("/")
    @ApiOperation(value = "创建用户",notes = "根据User对象创建用户")
    public Object add(@ModelAttribute("user")User user){
        userService.add(user);
        return ResultUtil.success();
    }

    @GetMapping("/jpa")
    @ApiOperation(value = "测试JPA查询用户",notes = "查询所有用户")
    @ResponseBody
    public Object testJPA(){
        return ResultUtil.success(userJPA.findAll());
    }

    @GetMapping("/mail")
    @ApiOperation(value = "测试邮件发送", notes = "邮件发送")
    @ResponseBody
    public Object testMail() throws Exception {
        Email email=new Email();
        email.setEmail("51103942@qq.com");
        mailService.sendSimpleMail(email);
        return ResultUtil.success( );
    }

}
