package com.xworkz.dominosapp;

import com.xworkz.dominosapp.dominos.Dominos;

public class DominosTester {

	          public static void main(String[] args) {
		 
	           String menu[] = new String[3];
	           menu[0] = "Margherita pizza";
	           menu[1] = "Freshveggie pizza";
	           menu[2] = "PaneerMakhani pizza";
	           
	           String staffNames[] = new String[3];
	           staffNames[0] = "Suresh";
	           staffNames[1] = "Mahesh";
	           staffNames[2] = "Ganesh";
	           
	           long contactNo[] = new long[3];
	           contactNo[0] = 9988003454L;
	           contactNo[1] = 9868989697L;
	           contactNo[2] = 9846006873L;
	           
	           String billingMethods[] = new String[3];
	           billingMethods[0] = "Cash";
	           billingMethods[1] = "Card";
	           billingMethods[2] = "Phonepay";
	           
	           
	           Dominos dm = new Dominos("Jayanagar","Veg","ARE23146",8,menu,staffNames,contactNo,billingMethods);
		
		       dm.displayInfo();
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
