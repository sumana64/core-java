package com.xworkz.relationship;

import java.util.Scanner;

import com.xworkz.relationship.Gender.Gender;
import com.xworkz.relationship.Hospital.Hospital;
import com.xworkz.relationship.Hospital.Patient;

public class HospitalTester {
       
	        public static void main(String[] args) {
				
	          Scanner sc = new Scanner(System.in);
	          System.out.println("enter the patientname");
	          String patientName = sc.next();
	          System.out.println("enter the address");
	          String address= sc.next();
	          System.out.println("enter the patient age");
	          int age = sc.nextInt();
	          Patient patient = new Patient(patientName,Gender.male,address,age);
	          Hospital hospital = new Hospital();
	          hospital.admit(patient);
	          //System.out.println("the patient is admitted:" + isAdmitted);
	        
	          
	          
	          sc.close();//   //as soon as u make use of scanner close it using close method present in the scanner method 
	   
	         
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
			}
}

