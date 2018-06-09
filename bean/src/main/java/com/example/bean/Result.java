package com.example.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<D> implements Serializable {

    /**错误码*/
    private int code;
    /**提示信息*/
    private String msg;
    /**具体的内容*/
    private D data;


}
