package com.xworkz.crud;

import java.util.Scanner;

import com.xworkz.crud.Gender.Gender;
import com.xworkz.crud.hospital.ApolloHospital;
import com.xworkz.crud.hospital.Patient;

public class ApolloTester {

	
	                      public static void main(String[] args) {
				     
	                      Scanner sc = new Scanner(System.in);
	                  
	                      System.out.println("enter the size:");                        
	                  
	                      int size = sc.nextInt();
	                  
	                      ApolloHospital apollo = new ApolloHospital(size); 
	                  
	                      for (int i = 0; i < size; i++) {
						
	                      Patient patient = new Patient(); 
		                  System.out.println("enter the name:" );
		                  patient.setName(sc.next());               // patient.name = sc.next();  
		                  System.out.println("Enter the address:");
		                  patient.setAddress(sc.next());
		                  System.out.println("enter the age:");
		                  patient.setAge(sc.nextInt());
		                  System.out.println("Enter the gender:");
		                  String  gender = sc.next();
		                  patient.setGender(Gender.valueOf(gender));  // patient.gender = Gender.valueOf(gender);
					
		                  apollo.addPatients(patient);
	                  
	                     }
	                  
	                      apollo.displayAllPatients();
	                      System.out.println("enter the particular patient name:");
	                      apollo.getPatientName(sc.next());
	                     
	                      System.out.println("enter the particular patient age:");
	                      apollo.getPatientByAge(sc.nextInt());
	                      
	                      System.out.println("enter the particular patient gender:");
	                      apollo.getPatientByGender(Gender.valueOf(sc.next()));
	                      
	                      System.out.println("enter the particular patient name using gender");
	                      apollo.getPatientNameByGender(Gender.valueOf(sc.next()));
	                      
	                      System.out.println("enter the name to get gender:");
	                      apollo.getGenderByPatientName(sc.next());
	                    	   	 
	                     }
	                      
	                      
	                      
	                      

}
