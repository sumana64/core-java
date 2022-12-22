package com.xworkz.access;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MetroCityNames {

	             public static void main(String[] args) {
					
	             String name1 = "bengaluru";
	             String name2 = "Delhi";
	             String name3 = "Chennai";
	             String name4 = "cochin";
	             String name5 = "Kolkatta";
	             
	             Collection<String> collection = new LinkedList();
	            	 
	            collection.add(name5);
	            collection.add(name4);
	            collection.add(name3);
	            collection.add(name2);
	            collection.add(name1);
	            
	            for(String ref:collection) {
	            	
	            	System.out.println(ref);
	            }
	            
	            Iterator<String> itr = collection.iterator();
	            
	            while(itr.hasNext()) {
	            	
	            	String element = itr.next();
	            	System.out.println(element);
	            }
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
				}
	
	
	
	
	
	
	
}
