package com.xworkz.encapsulation;

import com.xworkz.encapsulation.encap.BankDTO;

public class BankTester {

	           public static void main(String[] args) {
				
	        	BankDTO dto = new BankDTO();
	        	dto.setName("Union bank");
	        	System.out.println("the bank name is:" + dto.getName());
	        	dto.setIfscCode("ASD4568");
	        	System.out.println("the bank adress is:" + dto.getAddress());
	        	dto.setAddress("Nelamangala");
	        	System.out.println("the address is:" + dto.getAddress());
	        	   
			}
	
	
	
	
	
}
