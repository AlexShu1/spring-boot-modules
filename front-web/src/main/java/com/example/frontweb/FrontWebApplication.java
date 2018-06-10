package com.example.frontweb;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.example.*"})
/*Mybatis Mapper文件扫描*/
@MapperScan("com.example.daomybatis.mapper")
//@ComponentScan(basePackages = {"com.example.*"})
/*JPA 映射实体类扫描*/
@EntityScan("com.example.bean.jpa")
/*JPA Repository文件扫描*/
@EnableJpaRepositories("com.example.daojpa")
@EnableScheduling
public class FrontWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontWebApplication.class, args);
	}
}
