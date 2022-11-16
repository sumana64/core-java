package com.xworkz.relationship.Hospital;

import com.xworkz.relationship.Gender.Gender;

public class Patient {

	     public String name;
	     public Gender gender;  //enum const is applied
	     public String address;
	     public int age;
	     
	     public Patient(String name,Gender gender,String address,int age) {
	    	 
	    	 this.name = name;
	    	 this.gender = gender;
	    	 this.address = address;
	    	 this.age = age;
	    	 
	     }
	     
	     public void display() {
	    	  
	    	 System.out.println("the  patient name is:" + this.name);
	    	 System.out.println("the gender is:" + this.gender);
	    	 System.out.println("the address is:" + this.address);
	    	 System.out.println("the age is:" + this.age);
	    	 
	    	 
	     }
	
	
	
}
