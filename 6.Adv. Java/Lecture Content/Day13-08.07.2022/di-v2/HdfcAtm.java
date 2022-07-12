package com.cdac.component.atmandbank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm-v2")
public class HdfcAtm implements Atm {

	@Autowired
	private List<Bank> banks;
	
	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money..");
		Bank currentBank = null;
		for(Bank bank : banks) {
			if(bank.isAccountPresent(acno)) {
				currentBank = bank;
				break;
			}
		}
		currentBank.withdraw(12345, acno, amount);
	}

}
