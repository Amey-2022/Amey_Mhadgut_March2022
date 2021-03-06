package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cdac.component.Calculator;
import com.cdac.component.Car;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;
import com.cdac.component.TextEditor;
import com.cdac.component.atmandbank.Atm;
//import com.cdac.component.Atm;

public class App {
	
	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		//Accessing a particular bean
		HelloWorld hw= (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHellow("Amey"));
		//But why are we using Spring to create object of HelloWorld class?
		//We could have created object on our own like this:
		//HelloWorld hw = new HelloWorld();
		
		Calculator c= ctx.getBean("calc",Calculator.class);
		System.out.println(c.add(10,20));
		System.out.println(c.sub(10,20));
		
		CurrencyConverter cc=(CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD","INR", 650));
		
		LoginService ls=(LoginService) ctx.getBean("loginServ");
		System.out.println(ls.isValidUser("amey","123"));
		
		TextEditor te=(TextEditor) ctx.getBean("txtEdtr");
		te.load("abc.txt");
		
		Car c1=(Car) ctx.getBean("car");
		c1.drive();
		
//		Atm atm= (Atm) ctx.getBean("hdfcAtm");
//		atm.withdraw(101010, 5000);
		
		Atm atm1= (Atm) ctx.getBean("hdfcAtm-v2");
		atm1.withdraw(101010, 5000);
		
		Atm atm2= (Atm) ctx.getBean("hdfcAtm-v2");
		atm2.withdraw(202020, 5000);
		
	}
}
