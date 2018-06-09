package com.example.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Data
public class Email implements Serializable {

    //必填参数
    private String email;//接收方邮件
    private String subject;//主题
    private String content;//邮件内容
    //选填
    private String template;//模板
    private HashMap<String, String> kvMap;// 自定义参数
}
