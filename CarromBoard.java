package com.xworkz.overloading.conceptOverloading;

public class CarromBoard{
	
	          public String brand;
	          public String material;
	          public int players;
	          public String Coins[] = new String[3];
	
	
	         public CarromBoard() {
	        	 
	        	System.out.println("default constructor"); 
	        	 
	         }
	
	         public CarromBoard(String[] Coins) {
	        	 
	        	this("GSI","wooden",4,Coins);
	        	System.out.println("one paramterized constructor"); 
	        	 
	         }
	         
	         public CarromBoard(String brand,String material,int players,String Coins[]) {
	        	 
	        	this();
	        	this.brand = brand;
	        	this.material = material;
	        	this.players = players;
	        	this.Coins = Coins;
	        	 
	        	 
	         }
	         
	         public void display() {
	        	 
	        System.out.println("display() is invoked");
	        System.out.println(this.brand + " " + this.material + " " + this.players);
	        for (int i = 0; i < Coins.length; i++) {
				System.out.println("list of the coins");
				System.out.println(Coins[i]);
			} 
	        	 
	        	 
	        	 
	        	 
	         }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
