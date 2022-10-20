package com.xworkz.footware;

public class Footwear {

	

    static String brand;
    String type;
    String color;
    String material;
    int price;

  public Footwear(String type,String color,String material,int price) {
	  
	  System.out.println("footwear constructor is created");
	  
	  this.type = type;
	  this.color = color;
	  this.material = material;
	  this.price = price;
	  
	  
	  
  }
  
  public void walk() {
	  
	  System.out.println("to walk");
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
