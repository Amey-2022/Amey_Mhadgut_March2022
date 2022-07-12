package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.UserDao;
import com.cdac.entity.User;

public class App {

	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		UserDao dao = (UserDao) ctx.getBean("userDao");
		
		User user = new User();
		user.setUsername("vaibhav");
		user.setPassword("123456");
		user.setEmail("vaibhav@gmail");
		dao.add(user);
	}

}
