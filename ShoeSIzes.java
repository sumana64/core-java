package com.xworkz.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class ShoeSIzes {
          
	          public static void main(String[] args) {
				
	        	int shoe1 = 5; 
	        	int shoe2 = 6;
	        	int shoe3 = 7;
	        	int shoe4 = 8;
	        	int shoe5 = 9;
	        	int shoe6 = 10;
	        	int shoe7 = 40;
	        	int shoe8 = 35;
	        	int shoe9 = 36;
	        	int shoe10 = 37;
	        	int shoe11 = 38;
	        	int shoe12 = 39;
	        	int shoe13 = 41;
	        	int shoe14 = 42;
	        	int shoe15 = 43;
	        	
	        	Collection<Integer> collection = new ArrayList();
	        	
	        	collection.add(shoe1);
	        	collection.add(shoe2);
	        	collection.add(shoe3);
	        	collection.add(shoe4);
	        	collection.add(shoe5);
	        	collection.add(shoe6);
	        	collection.add(shoe7);
	        	collection.add(shoe8);
	        	collection.add(shoe9);
	        	collection.add(shoe10);
	        	collection.add(shoe11);
	        	collection.add(shoe12);
	        	collection.add(shoe13);
	        	collection.add(shoe14);
	        	collection.add(shoe15);
	        	
	        	
	        	for(int element:collection) {
	        		
	        		System.out.println(element);
	        	}
	        	
	        	Iterator<Integer> itr = collection.iterator();
	        	
	        	while(itr.hasNext()) {
	        		
	        		Integer ref = itr.next();
	        		System.out.println(ref);
	        	}
	        	  
	        	  
	        	  
	        	  
			}
}
