package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.searchEngine.Google;
import com.xworkz.inheritanceapp.searchEngine.SearchEngine;

public class SearchEngineTester {

	         public static void main(String[] args) {
				
	         SearchEngine eng = new SearchEngine();
	         
	         eng.search("google");
	         
	         SearchEngine se = new SearchEngine();
	         se.search("internetexplorer");
	         
	         Google gl = new Google();
	         gl.search("Yahoo");
	         
	         Google google = new Google();
	         google.search("Opera browser");
	        	 
	        	 
	        	 
	        	 
			}
	
	
	
	
	
	
}
