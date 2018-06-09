package com.example.frontweb;

import com.example.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrontWebApplicationTests {

	@Resource
	private IUserService userService;

	@Test
	public void contextLoads() {
		 System.out.println(userService.findAll().toString());
	}

}
