package com.example.frontweb.controller;

import com.example.service.IUserService;
import com.example.utils.LqNiceUtil;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@RestController
public class IndexController {

    @Resource
    private IUserService userService;


    @GetMapping("/")
    @ResponseBody
    public Object test(){
        Map<String,String> map=new HashMap<>();
        map.put("hello !"," spring boot modules");
        map.put("userList",userService.findAll().toString());
        return map.toString();
    }
}
