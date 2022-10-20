package com.xworkz.medicalapp.medicalshop;

public class MedicalShop1 {

	  
    public  String address;
    public  String name;
    public  String staffNames[];
    public  long  staffContactNo[];
    public  String medicineNames[];
    public  String cosmetics[];
    public  int noOfSections[];
    public  String billingMethod[];
	  public  String gstNo;
	  
	  public MedicalShop1(String gstNo, String address,String name,String staffNames[],long staffContactNo[],  String medicineNames[], String cosmetics[],int noOfSections[],String billingMethod[]) {
		   
		  this.name = name;
		  this.gstNo = gstNo;
		  this.address = address;
		  this.staffNames =staffNames;
		  this.staffContactNo = staffContactNo;
		  this.medicineNames = medicineNames;
		  this.cosmetics = cosmetics;
		  this.noOfSections = noOfSections;
		  this.billingMethod = billingMethod;
		  
		  
		 
	  }
        
    public void display() {
  	  
  	  System.out.println("Medical shop name is " + name);
  	  System.out.println("===================");
  	  System.out.println("medical shop gstno is " + gstNo);
  	  System.out.println("===================");
  	  System.out.println("medical shop address" + address);
  	  System.out.println("=====================");
  	  System.out.println("medical staffNo");
  	  for (int i = 0; i <staffNames.length; i++) {
  		  System.out.println(staffNames[i]);
			
		  }
  	  System.out.println("====================");
  	  System.out.println("medical shop mediceNames");
  	  for (int i = 0; i < medicineNames.length; i++) {
			
  		  System.out.println(medicineNames[i]);
		
  	  }
  	  System.out.println("======================");
  	  System.out.println("medical shop cosmetics");
  	  for (int i = 0; i < cosmetics.length; i++) {
  		  System.out.println(cosmetics[i]);
			
		 }
  	  System.out.println("=======================");
  	  System.out.println("medical shop noOfsections");
  	  for (int i = 0; i < noOfSections.length; i++) {
  		  System.out.println(noOfSections[i]);
			
		}
        System.out.println("========================");
        System.out.println("medical shop billingmethod");
     for (int i = 0; i < billingMethod.length; i++) {
		
  	   System.out.println(billingMethod[i]);
	}
		}
			
		
        
        
        
        
        
        
        

    }
	
	
	
	
	
	
	
	
	

