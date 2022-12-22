package com.xworkz.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	               public static void main(String[] args) {
					
	            	String watch1 = "rollex";
	            	String watch2 = "titan";
	            	String watch3 = "fastrack";
	            	String watch4 = "Noise";
	            	String watch5 = "Fossil";
	            	String watch6 = "Mi smart";
	            	
	            	Collection<String> ref = new ArrayList();
	            	   
	            	ref.add(watch6);
	            	ref.add(watch5);
	            	ref.add(watch4);
	            	ref.add(watch3);
	            	ref.add(watch2);
	            	ref.add(watch1);
	            	
	            	for(String element: ref) {
	            		
	            		
	            		System.out.println(element);
	            	
	            	}
	            	
	            	Iterator<String> itr = ref.iterator();
	            	   
	            	while(itr.hasNext()) {
	            		
	            		String ref2 = itr.next();
	            		System.out.println(ref2);
	            	}
	            	   
	            	   
	            	   
	            	   
	            	   
	            	   
				}
	
	
	
	
	
	
	
	
	
	
}
