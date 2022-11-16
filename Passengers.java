package com.xworkz.relationship.train;

import com.xworkz.relationship.Gender.Gender1;

public class Passengers {

	         public int no;
	         public String[] passengers;
	         public String address;
	         public Gender1 gender;
	         
	         public Passengers(int no,String[] passengers,String address, Gender1 gender) {
	        	 
	        	 this.no = no;
	        	 this.passengers = passengers;
	        	 this.gender = gender;
	        	 this.address = address;
	        	
	        	 
	         }
	         
	         public void display() {
	        	 
	        	 System.out.println(this.no);
	        	 System.out.println(this.address);
	        	 System.out.println(this.gender);
	        	 for (int i = 0; i < passengers.length; i++) {
					System.out.println(passengers[i]);
				}
	        	 
	         }
	
	
	
	
	
}
