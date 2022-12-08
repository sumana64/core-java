package com.xworkz.crud2.showroom;

import com.xworkz.crud2.Gender.Gender;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Manager {

	            public String name;
	            public String address;
	            public Gender gender;
	            public int age;
	            
	            public Manager() {
	            	
	            	System.out.println("constructor is created");
	            	
	            }
	            
	            public Manager(String name,String address,Gender gender,int age) {
	            	
	            	this.name = name;
	            	this.address = address;
	            	this.gender = gender;
	            	this.age = age;
	            		
	            	
	            }
	            
	            public void displayManager() {
	            	
	            	System.out.println("the magaer name is:" + this.name);
	            	System.out.println("the manager address is:" + this.address);
	            	System.out.println("the manager gender is:" + this.gender);
	            	System.out.println("the manager age is:" + this.age);
	            	
	            	
	            	
	            }
	            
	
	
	
	
	
	
	
	
	
}
