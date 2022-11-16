package com.xworkz.relationship.CoffeShop;

public class CoffeShop {

	     public CoffePowder coffePowder;
	     public boolean isConnected;
	     public boolean isWaterAdded;
	     public boolean isSugarAdded;
	     
	    	 
	     public boolean filter(CoffePowder coffePowder,boolean isConnected,boolean isWaterAdded, boolean isSugarAdd) {
	    	 boolean filtered = false;
	    	 if(isConnected == true) {
	    		System.out.println("the filter is turned on"); 
	    		    if(coffePowder!=null) {
	    		    	
	    		    	System.out.println("coffePowder found");
	    		    	this.coffePowder = coffePowder;
	    		    	System.out.println("the details of coffePowder");
	    		    	this.coffePowder.displayDetails();
	    		    	System.out.println("the water isAdded:" + this.isWaterAdded);
	    		    	System.out.println("the sugar is added:" + this.isSugarAdded);
	    		    	 filtered = true;
	    		    }else {
	    		    	
	    		    	System.out.println("coffepoder is not found");
	    		    }
	    		
	    	 }else {
	    		 
	    		 System.out.println("the filter is turned off");
	    	 }
	    	     
	     
	    	 
	    	
	     return filtered;	 
	    	 
	     }
	
}
