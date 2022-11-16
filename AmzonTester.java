package com.xworkz.relationship;

import com.xworkz.relationship.Amazon.Amazon;
import com.xworkz.relationship.Amazon.Products;
import com.xworkz.relationship.PayMode.PayMode;

public class AmzonTester {
            
	           public static void main(String[] args) {
				
	        	String[] product = {"Pants","Skirts","Tshirts","Joggers"};
	        	Products pr = new Products("Saree","DSC567",1500);
	        	Amazon amazon = new Amazon(product,PayMode.googlepay);
	        	amazon.isAddedCart = true;
	        	amazon.isOrdered = true;
	        	amazon.pay = 1500;
	        	boolean ref = amazon.order(pr);
	        	System.out.println("the product is ordered:" + ref);
			}


}
