package com.xworkz.iceCream;

import com.xworkz.iceCream.icecreamParlour.IceCreamParlour;

public class IceCreamParlourTester {

	                 public static void main(String[] args) {
		            
	                 String menu[] = new String[3];
	                 menu[0] = "butterscothCone";
	                 menu[1] = "gudbud";
	                 menu[2] = "cornetto";
	                 
	                 String branches[] = new String[3];
	                 branches[0] = "Rajajinagar";
	                 branches[1] = "Malleshwaram";
	                 branches[2] = "Vijayanagar";
	                 
	                 String staffNames[] = new String[3];
	                 staffNames[0] = "Rajesh";
	                 staffNames[1] = "Shilpa";
	                 staffNames[2] = "Suma";
	                 
	                 String billing[] = new String[3];
	                 billing[0] = "cash";
	                 billing[1] = "card";
	                 billing[2] = "phonepay";
	                 
	                 
	                 IceCreamParlour Ice = new IceCreamParlour("Arun","Shanthinagar","RDEG3464",3,menu,branches,staffNames,billing);
	               
	                 Ice.displayInfo();

	                 
	
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 }

}
