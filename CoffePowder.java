package com.xworkz.relationship.CoffeShop;

public class CoffePowder {

	     public String brand;
	     public String texture;
	     public String size;
	     
	     public CoffePowder(String brand,String texture,String size) {
	    	 
	    	 this.brand = brand;
	    	 this.texture = texture;
	    	 this.size = size;
	     }
	     
	     public void displayDetails() {
	    	 
	    	 System.out.println("the brand is:" + this.brand);
	    	 System.out.println("the texture is:" + this.texture);
	    	 System.out.println("the size is :" + this.size);
	    	 
	     }
	
	
	
	
	
}
