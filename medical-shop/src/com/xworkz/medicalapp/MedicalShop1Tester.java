package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop1;

public class MedicalShop1Tester {

	public static void main(String[] args) {
		
		   String staffNames[] = new String[3];
		   staffNames[0] = "suresh";
		   staffNames[1] = "Ramesh";
		   staffNames[2] = "Raghav";                                            //chatshop     menu
		                                                                      //milkparlour
		                                                                     //IcecreamsParlour
		   long  staffContactNo[] = new long[3];
		   staffContactNo[0] = 8989087987L;
		   staffContactNo[1] = 8090868669L;
		   staffContactNo[2] = 9884687997L;
		   
		   String medicineNames[] = new String[3];
		   medicineNames[0] = "paracetamol";
		   medicineNames[1] = "dolo";
		   medicineNames[2] = "vix";
		   
		   
		   String cosmetic[] = new String[3];
		   cosmetic[0] = "nivea lipbalm";
		   cosmetic[1] = "himalaya shampoo";
		   cosmetic[2] = "mac lipstic";
		   
		   int noOfSections[] = new int [2];
		   noOfSections[0] = 1;
		   noOfSections[1] = 2;           
		  
		   
		   String billingMethod[] = new String[3];
		   billingMethod[0] = "cash";
		   billingMethod[1] = "card";
		   billingMethod[2] = "phonepay";
		   
		   MedicalShop1 med = new MedicalShop1("EDTFFH456","vijayanagar", "Maruthi mrdicals",staffNames,staffContactNo,medicineNames,cosmetic,noOfSections,billingMethod);
		   
		   
		   med.display();
		   
		   
		   

	}

}
