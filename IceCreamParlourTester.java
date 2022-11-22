package com.xworkz.encapsulation;

import com.xworkz.encapsulation.encap.IceCreamParlourDTO;

public class IceCreamParlourTester {

	  public static void main(String[] args) {
			
     	 IceCreamParlourDTO dto = new IceCreamParlourDTO();
     	 dto.setName("Arun");
     	 System.out.println("the name is:" + dto.getName());
     	 dto.setIfscCode("SDER4356");
     	 System.out.println("the ifscCode is:" + dto.getIfscCode());
     	 dto.setLocation("Vijayanagar");
     	 System.out.println("the address is:" + dto.getLocation());
     	 
		}
	
	           
	
	
	
	
	
	
	
	
}
