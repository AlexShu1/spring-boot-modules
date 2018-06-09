package com.example.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Data
public class User implements Serializable{

    private Integer id;
    private String name;

}
