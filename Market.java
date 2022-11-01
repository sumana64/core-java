package com.xworkz.overloading.conceptOverloading;

public class Market {

	     public String name;
	     public String location;
	     public String[] vegetables = new String[5];
	     public int shops;
	     
	     
	     public Market() {
	    	
	   
	    	System.out.println("default constructor"); 
	    	 
	    	 
	     }
	     
	     public Market(String[] vegetables) {
	    	 
	    	this("sante","Nelamangala",vegetables,5);
	    	System.out.println("one parametrized");
	    	 
	    	 
	     }
	     
	     public Market(String name,String location,String vegetables[],int shops) {
	    	
	    	this();
	    	System.out.println("parameterized constructor"); 
	    	this.name = name;
	    	this.location = location;
	    	this.vegetables = vegetables;
	    	this.shops = shops;
	    	 
	    }
	   
	    public void display() {
	    	
	    System.out.println("display() is invoked");	
	    System.out.println(this.name + " " + this.location + " " + this.shops);
	    for (int i = 0; i < vegetables.length; i++) {
			System.out.println("list of the vegetables :" + vegetables[i]);
		
	    
	    }	
	    	
	    	
	  }
	     
	     
	     
	     
	
	
	
	
	
	
	
	
	
}
