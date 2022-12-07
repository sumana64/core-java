package com.xworkz.crud.hospital;

import com.xworkz.crud.Gender.Gender;
import com.xworkz.crud.hospitalGender1.Gender1;

public class ApolloHospital extends Hospital{

	            public Patient[] patients;
	            
	            public int index;
	            
	            public ApolloHospital(int size) {
	            	
	            	patients = new Patient[size];
	           
	            }
	            
	            public boolean addPatients(Patient patient) {
	            	
	            System.out.println("inside the add patient");
	            	
	                  boolean isPatientAdded = false;                    
					
	                    if(patient!= null) {
	                    	 
	                   System.out.println("the patient is added");
	                    	    
	                    	  patients[index++]= patient; 
	                    	       
	                    	   isPatientAdded = true;
	                    
	                     }  
	                   
	              return isPatientAdded;	
	            	
	            }
	            
	            public void displayAllPatients() {
	            	
	            	for (int i = 0; i < patients.length; i++) {
						 
	            		System.out.println(patients[i].getName() + " " + patients[i].getAddress() + " " + patients[i].getGender() + " " + patients[i].getAge());
					      
	            	
	            	}
	            	
	            }
	            
	            public void getPatientName(String patientName) {
	            	
	            	System.out.println("Inside the getpatientName");
	            	
	            	System.out.println("one parameter:1");
	            	
	            	for (int i = 0; i < patients.length; i++) {
						
	            		 if(patients[i].getName().equals(patientName)) {
	            			 
	            			 System.out.println(patients[i].getName() + " " + patients[i].getAddress() + " " + patients[i].getGender() + " " + patients[i].getAge());
	            			 
	            		 }
	            		 
	            	
	            	}
	            	
	            	
	            }
	            
	            public void getPatientByAge(int age) {
	            	
	            	System.out.println("Inside the patient by age");
	            	
	            	for (int i = 0; i < patients.length; i++) {
						
	            		  if(patients[i].getAge()== age) {
	            			  
	            			  System.out.println(patients[i].getAge() + " " + patients[i].getName() + " " + patients[i].getAddress() + " " + patients[i].getGender());
	            			  
	            			  
	            		  }
	            		
					}
	            	
	           	
	            }
	            
	            public void getPatientByGender(Gender gender) {
	            	
	            	System.out.println("Inside the gender method");
	            	
	            	for (int i = 0; i < patients.length; i++) {
						
	            		if(patients[i].getGender() == gender) {
	            			
	            			
	            			System.out.println(patients[i].getAge() + " " + patients[i].getGender() + " " + patients[i].getName() + " " + patients[i].getAddress());
	            		}
					
	            	}
	            	
	            }
	            
	            public void getPatientByAddress(String address) {
	            	
	            	 System.out.println("Inside the address method");
	            	 
	            	 for (int i = 0; i < patients.length; i++) {
						
	            		 if(patients[i].getAddress() == address) {
	            			 
	            			 System.out.println(patients[i].getAge() + " " + patients[i].getGender() + " " + patients[i].getName() + " " + patients[i].getAddress());
	            		 }
					}
	            	
	            }
	            
	            public void getPatientNameByGender(Gender gender) {
	            	
	            	for (int i = 0; i < patients.length; i++) {
						
	            		 if(patients[i].getGender() == gender) {
	            			 
	            			 System.out.println(patients[i].getName());
	            		 }
					}
	            	
	            }
	            
	            public void getGenderByPatientName(String name) {
	            	
	            	for (int i = 0; i < patients.length; i++) {
						
					     if(patients[i].getName()== name) {
					    	 
					    	 System.out.println(patients[i].getGender());
					     }
	            	 
	            	
	            	}
	            	
	            	
	            }
	            		                               
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	
	
	
	
	
	
}
