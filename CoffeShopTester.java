package com.xworkz.relationship;

import com.xworkz.relationship.CoffeShop.CoffePowder;
import com.xworkz.relationship.CoffeShop.CoffeShop;

public class CoffeShopTester {

	                 public static void main(String[] args) {
						
	                CoffePowder cofee = new CoffePowder("Nescafe","powdered","100gm");
	                 
	                CoffeShop coffeShop = new CoffeShop();
	                coffeShop.filter(cofee, true, false, false);
	                	 
	                	 
					}
	
	
	
	
	
	
	
	
}
