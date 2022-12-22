package com.xworkz.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Animal {

	          public static void main(String[] args) {
				
	        	 String name1 = "Cow";
	        	 String name2 = "Sheep";
	        	 String name3 = "elephant";
	        	 String name4 = "Deer";
	        	 String name5 = "Tiger";
	        	 String name6 = "Lion";
	        	 String name7 = "crocodile";
	        	 String name8 = "Monkey";
	        	 String name9 = "Dog";
	        	 String name10 = "buffalo";
	        	  
	        	 Collection<String> collection = new ArrayList();
	        	 
	        	 collection.add(name1);
	        	 collection.add(name2);
	        	 collection.add(name3);
	        	 collection.add(name4);
	        	 collection.add(name5);
	        	 collection.add(name6);
	        	 collection.add(name7);
	        	 collection.add(name8);
	        	 collection.add(name9);
	        	 collection.add(name10); 
	        	 
	        	 for(String element:collection) {
	        		 
	        		 System.out.println(element);
	        	 }
	        	 
	        	 Iterator<String> itr = collection.iterator();
	        	 
	        	  while(itr.hasNext()) {
	        		  
	        		  String ref = itr.next();
	        		  System.out.println(ref);
	        		  
	        	  }
	        	  
	        	  
	        	  
	        	  
	        	  
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
