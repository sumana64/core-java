package com.xworkz.encapsulation;

import com.xworkz.encapsulation.encap.BeachDTO;

public class BeachTester {
          
	              public static void main(String[] args) {
					
	              BeachDTO dto = new BeachDTO();
	              dto.setName("Baga");
	              System.out.println("the name is:" + dto.getName());
	              dto.setAddress("Goa");
	              System.out.println("the address is:" + dto.getAddress());
	              dto.setId(675);
	              System.out.println("the id is:" + dto.getId());
				}
}
