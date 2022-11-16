package com.xworkz.methodoverriding.Fruit;

public class Orange extends Fruit{

	             @Override
	             public String getNutrition(String name) {
	            	 
	            	 System.out.println("we get vitamin C from the fruit Orange");
	            
	             return name;
	             }
	             
}
