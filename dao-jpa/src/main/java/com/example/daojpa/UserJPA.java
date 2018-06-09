package com.example.daojpa;

import com.example.bean.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@Repository
public interface UserJPA extends JpaRepository<User,Long> {

}
