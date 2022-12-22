package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Coupons {

	              public static void main(String[] args) {
					
	            String coupons1 = "clothes";
	            String coupons2 = "Movies";
	            String coupons3 = "vessels";
	            String coupons4 = "makeup";
	            String coupons5 = "accessories";
	            String coupons6 = "pesonal care";
	            String coupons7 = "food";  
	            String coupons8 = "healthy products";  
	            String coupons9 = "skin care";  
	            String coupons10 = " bus booking";  
	            String coupons11 = "travelling";
	            String coupons12 = "hotel booking";
	            	  
	            	  
	            Collection<String> collection = new TreeSet();  
	            collection.add(coupons1);
	            collection.add(coupons2);
	            collection.add(coupons3);
	            collection.add(coupons4);
	            collection.add(coupons5);
	            collection.add(coupons6);
	            collection.add(coupons7);
	            collection.add(coupons8);
	            collection.add(coupons9);
	            collection.add(coupons10);
	            collection.add(coupons11);
	            collection.add(coupons12);
	            
	            System.out.println(collection.size());
	            
	            collection.clear();
	            
	            System.out.println(collection.size());
	            	  
	            	  
	            	  
	            	  
				}
	
	
	
	
	
	
	
	
}
