package com.xworkz.relationship.Amazon;

public class Products {

	          public String name;
	          public String code;
	          public int amount;
	
	
	         public Products(String name,String code,int amount) {
	        	 
	        	 this.name = name;
	        	 this.code = code;
	        	 this.amount = amount;
	        	 
	         }
	         
	         public void display() {
	        	 
	        	 System.out.println("the name is:" + this.name);
	        	 System.out.println("the code is:" + this.code);
	        	 System.out.println("the amount is:" + this.amount);
	        	 
	        	 
	         }
	
	
	
}
