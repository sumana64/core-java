package com.xworkz.crud.hospital;

public class Hospital {


    public Patient patient;
    public boolean isEmergency = true;
    public boolean isTreatementRequired = true;
    
    public boolean admit(Patient patient) {
  	  boolean isAdmitted = false;
  	  if(isTreatementRequired == true){
  		  System.out.println("Treatement is allowed");
  		 if(isEmergency == true) {
  			this.patient = patient;
  			this.patient.display();
  			System.out.println("the patient is allowed into ICU rooms");
  			isAdmitted = true;

  			
  		 }else {
  			 System.out.println("the patient is allowed into generalward");
  		 }
  		  
  	  }else {
  		  
  		  System.out.println("tretement is not possible");
  	  }
  	  return isAdmitted;
  	  
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
}
