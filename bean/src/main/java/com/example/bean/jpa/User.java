package com.example.bean.jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Data
@Entity
@Table(name="tb_user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
