package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("loginServ")
public class LoginService {
	public boolean isValidUser(String username,String password) {
		if(username.equals("amey") && password.equals("123"))
			return true;
		return false;
		
	}	
}
