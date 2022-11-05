package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.coffe.CoffePowder;
import com.xworkz.inheritanceapp.coffe.Levista;

public class CoffePowderTester {

	        public static void main(String[] args) {
			 
	 
	        CoffePowder coff = new CoffePowder();
	        coff.makeCoffe("Bru");
	        
	        CoffePowder powder = new CoffePowder();
	        powder.makeCoffe("Nescafe");
	        
	        Levista lev = new Levista();
	        lev.makeCoffe("Cothas");
	        
	        Levista vista= new Levista();
	        vista.makeCoffe("GoldBeans");
	        
	
	
	
	
	
	
	        }	
	
	
}
