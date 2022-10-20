package com.xworkz.cloth;

public class Jewellary {

	          static String brand;
	          
	          String name;
	          String type;
	          String shape;
	          int price;
	          
	          public Jewellary(String name,String type,String shape,int price) {
	        	  
	        	  System.out.println("jeewllary constructor is created");
	        	  
	        	  this.name = name;
	        	  this.type = type;
	        	  this.shape = shape;
	        	  this.price =price;
	        	  
	          }
	          
	          public void wear() {
	        	  
	        	  System.out.println("looking beautiful");
	        	  
	        	  
	          }
	          
	          public static void main(String[] args) {
				
			   Jewellary.brand = "kalyan";
			   
			   Jewellary jew = new Jewellary("ring","diamond","round",20000);
			   System.out.println(jew.name + " " + jew.type + " " + jew.shape + " " + jew.price);
			   System.out.println(Jewellary.brand);
	          
	          
			   Jewellary jew1 = new Jewellary("earring","gold","rectangle",10000);
			   System.out.println(jew1.name + " " + jew1.type + " " + jew1.shape + " " + jew1.price);
			   System.out.println(Jewellary.brand);
	          
	          
			   Jewellary jew2= new Jewellary("chain","silver","oval",15000);
			   System.out.println(jew2.name + " " + jew2.type + " " + jew2.shape + " " + jew2.price);
			   System.out.println(Jewellary.brand);
	          
			   Jewellary jew3 = new Jewellary("bracelet","platinum","square",50000);
			   System.out.println(jew3.name + " " + jew3.type + " " + jew3.shape + " " + jew3.price);
			   System.out.println(Jewellary.brand);
	          
	          
	          
	          
	          
	          
	          
	          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


