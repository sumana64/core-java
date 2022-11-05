package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.company.Company;
import com.xworkz.inheritanceapp.company.Tcs;

public class CompanyTester {

	
	           public static void main(String[] args) {
				
	        	Company com = new Company();
	        	com.toStoredata("Akash");
	        	
	        	Company cp = new Company();
	             cp.toStoredata("sneha");  
	        	   
	        	 Tcs ts = new Tcs();
	        	 ts.toStoredata("Lakshmi");
	        	 
	        	 Tcs cs = new Tcs();
	        	 cs.toStoredata("Ravi");
	        	   
	        	   
			}
	
	
	
	
	
}
