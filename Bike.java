package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
                  
	             public static void main(String[] args) {
					
	            	String bike1 = "Bullet";
	            	String bike2 = "passion";
	            	String bike3 = "activa";
	            	String bike4 = "yamaha"; 
	            	String bike5 = "suzuki";
	            	String bike6 = "pulsar"; 
	            	String bike7 = "Ronin";
	            	String bike8 = "honda shine";
	            	String bike9 = "ducati";
	            	String bike10 = "Apache";
	            	String bike11 = "hero destini";
	            	String bike12 = "passion";
	            	String bike13 = "hunter";
	            	String bike14 = "Duke";
	            	String bike15 = "Xpulse";
	            	String bike16 = "DesertX";
	            	String bike17 = "honda Unicorn";
	            	String bike18 = "Burman";
				
	             
	                Collection<String> collection = new TreeSet();
	             
	                collection.add(bike1);
	                collection.add(bike2);
	                collection.add(bike3);
	                collection.add(bike4);
	                collection.add(bike5);
	                collection.add(bike6);
	                collection.add(bike7);
	                collection.add(bike8);
	                collection.add(bike9);
	                collection.add(bike10);
	                collection.add(bike11);
	                collection.add(bike12);
	                collection.add(bike13);
	                collection.add(bike14);
	                collection.add(bike15);
	                collection.add(bike16);
	                collection.add(bike17);
	                collection.add(bike18);
	                
	                System.out.println(collection.size());
	                
	                collection.clear();
	                
	                System.out.println(collection.size());
	                
	       
	             
	             
	             
	             }
}
