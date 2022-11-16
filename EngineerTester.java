package com.xworkz.methodoverriding;

import com.xworkz.methodoverriding.Engineer.CsEngineer;
import com.xworkz.methodoverriding.Engineer.EcEnginner;
import com.xworkz.methodoverriding.Engineer.Engineer;

public class EngineerTester {

	            public static void main(String[] args) {
					
	            Engineer engineer = new EcEnginner();	
	            engineer.solveProblems();
	            
	            Engineer csEngineer = new CsEngineer();
				
	         
	           
	            }        
}
