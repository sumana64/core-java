package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.ecommerce.Ecommerce;
import com.xworkz.inheritanceapp.ecommerce.Flipkart;

public class EcommerceTester {


	   public static void main(String[] args) {
		
		Ecommerce ecom = new Ecommerce();
		ecom.shoppingClothes("sari");
		
		Ecommerce com = new Ecommerce();
		com.TobuyProduct("Kurti",800);
		
		Flipkart kart = new Flipkart();
		kart.shoppingClothes("sari");
		
		Flipkart flip = new Flipkart();
		flip.TobuyProduct("salwar",1000);
		   
		   
		   
		   
		   
	}
	
	
	
	
	
	
	
	
}
