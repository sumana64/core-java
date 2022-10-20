package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;

public class MedicalShopTester {

	public static void main(String[] args) {
		
		      MedicalShop  med = new MedicalShop();
		      med.gstNo = "EDTFFH456";
		      med.address = "vijayanagar";
		      med.name = "Maruthi mrdicals";

		      med.staffNames = new String[3];
		      med.staffNames[0] = "Suresh";
		      med.staffNames[1] = "Ramesh";
		      med.staffNames[2] = "Raghav";
		      
		      
		      med.staffContactNo = new long[3];
		      med.staffContactNo[0] = 9880060045L;
		      med.staffContactNo[1] = 9880060046L;
		      med.staffContactNo[1] = 9880060047L;
		      
		      med.medicineNames = new String[3];
		      med.medicineNames[0] = "Ranidom tab";
		      med.medicineNames[1] = "paracetomol tab";
		      med.medicineNames[2] = "hifenac tab";
		      
		      med.cosmetics = new String[3];
		      med.cosmetics[0] = "mac eyeliner";
		      med.cosmetics[1] = "lakhme lipbalm";
		      med.cosmetics[2] = "himalaya shampoo";
		      
		      med.noOfSections = new int[3];
		      med.noOfSections[0] = 1;
		      med.noOfSections[1] = 2;
		      med.noOfSections[2] = 3;
		      
		      med.billingMethod = new String[3];
		      med.billingMethod[0] = "cash";
		      med.billingMethod[1] = "debit card";
		      
		      med.display();
		      
		      
		      
		      
		      
		      
		      
	}

}
