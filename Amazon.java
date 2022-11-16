package com.xworkz.relationship.Amazon;

import com.xworkz.relationship.PayMode.PayMode;

public class Amazon {
        
	            public Products products;
	            public boolean isAddedCart;
	            public boolean isOrdered;
	            public int pay;
	            public String product[];
	            public PayMode payMode;
	      
	            
	            public Amazon(String product[],PayMode payMode) {
	            	 
	            	System.out.println("the amazon object is created ");
	            	this.product = product;
	            	this.payMode = payMode;
	            	this.display1();
	            	
	            }
	            
	            public boolean order(Products pro) {
	            	boolean isOrder= false;
	            	if(isAddedCart == true) {
	            		if(pay>=1000) {
	            			
	            			System.out.println("the pay is paid");
	            	
	            		if(isOrdered == true) {
	            			this.products = pro;
	            			this.products.display();
	            			System.out.println("the product is ordered");
	            			isOrder = true;
	            		}
	            		else {
	            			
	            			System.out.println("the product is not ordered");
	            			
	            		}
	            		}
	            		else {
	            			System.out.println("the pay is not paid");
	            		}
	            		}
	            	  else {
	            		
	            		System.out.println("the item is not added to cart");
	            	}
	            	
	            	return isOrdered;
	            	
	            }
	            
	            public void display1() {
	            	
	            	System.out.println("the paymode is:" + this.payMode);
	            	for (int i = 0; i < product.length; i++) {
						System.out.println(product[i]);
					}
	            	
	            	
	            }
	      
	      
}


