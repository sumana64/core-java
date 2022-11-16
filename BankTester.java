package com.xworkz.relationship;

import com.xworkz.relationship.Type.Type;
import com.xworkz.relationship.bank.Account;
import com.xworkz.relationship.bank.Bank;

public class BankTester {

	            public static void main(String[] args) {
					
	            Account account = new Account("unionBank","ADFR3456",Type.savingsAccount,"VijayNagar");
	            Bank bank = new Bank();
	            bank.isAdharCard = true;
	            bank.isPanCard = true;
	            boolean create = bank.CreateAccount(account);
	            System.out.println("the bank account created is:" + create);
	            	
				}
	
	
	
	
	
	
}
