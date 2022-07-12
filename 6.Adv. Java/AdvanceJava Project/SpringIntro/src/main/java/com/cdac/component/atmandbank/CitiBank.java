package com.cdac.component.atmandbank;

import org.springframework.stereotype.Component;

@Component("citiBank-v2")
public class CitiBank implements Bank {

	public boolean isAccountPresent(int acno) {
		if(acno == 101010)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	}

}
