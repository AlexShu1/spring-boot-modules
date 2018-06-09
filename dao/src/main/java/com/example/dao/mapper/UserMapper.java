package com.example.dao.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Component
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM tb_user")
    List<User> findAll();

}
