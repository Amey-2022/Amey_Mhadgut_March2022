package com.cdac.component;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank {

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	}
}
