package com.xworkz.crud.hospital;

import com.xworkz.crud.Gender.Gender;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Patient {
	

    private String name;
    private Gender gender;  //enum const is applied
    private String address;
    private int age;
    
    public Patient() {
    	
    	System.out.println("the constructor is created");
    }
    
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
