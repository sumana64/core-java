package com.xworkz.encapsulation;

import com.xworkz.encapsulation.encap.MobileDTO;

public class MobileTester {

	              public static void main(String[] args) {
					
				
	              MobileDTO dto = new MobileDTO();
	              dto.setBrand("Sumsung");
	              System.out.println("the mobile brand is:" + dto.getBrand());
	              dto.setCamera("30MP");
	              System.out.println("the camera quality  is:" + dto.getCamera());
	              dto.setPrice(35000);
	              System.out.println("the price is:" + dto.getPrice());
	
	
	
	
	
	
	
	              }
	
	
	
}
