package com.example.frontweb.controller;

import com.example.utils.LqNiceUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@RestController
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String test(){
        return LqNiceUtil.getCurrentDateTime();
    }
}
