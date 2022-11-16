package com.xworkz.relationship;

import java.util.Scanner;

public class WrapperTester {

	          public static void main(String[] args) {
				Scanner sc = new Scanner(System.in) ;
				System.out.println("Enter the age:");
				int age = sc.nextInt();
	            System.out.println(age);             //premitive
	        	                 //boxing       to
	        	Integer age1 = age;         //wrapperclass
	        	                
	        	 System.out.println(age1);                            // unboxing           to
	        	
	        	int age2 = age1;           //premitive
	        	System.out.println("enter the phone no:");
	        	 long phone = sc.nextLong();
	             System.out.println(phone);
	        	
	        	Long ph1 = phone;
	        	
	        	long ph2 = ph1;
	        	
	        	float no = 6.5f;
	        	
	        	Float no1 = no;
	        	
	        	float no2 = no1;
	        	
	        	double num = 0.665;
	        	
	        	Double num1 = num;
	        	
	        	double num2 = num1;
	        	
	        	boolean a = true;
	        	
	        	Boolean b = a;
	        	
	        	boolean c = b;
	        	
	        	char ch = 'A';
	        	
	        	Character ch1 = ch;
	        	
	        	Character ch2 = ch1;
	        	
	        	
	        	  
			}
	
	
}
