package com.xworkz.relationship;

import com.xworkz.relationship.Gender.Gender1;
import com.xworkz.relationship.train.Passengers;
import com.xworkz.relationship.train.Train;

public class TrainTester {

	           public static void main(String[] args) {
				
	        	 String[] passengers = {"manu","ravi","shankar"};
	        	 Passengers pass = new Passengers(1209,passengers,"Nelamnagala",Gender1.male);
	        	 Train train = new Train("Delhiexpress","Yeshwanthpur");
	        	 System.out.println(train.name);
	        	 System.out.println(train.stand);
	        	 train.isPaid = true;
	        	 train.isTicketgot = true;
	        	 train.isSeatReserved = true;
	        	 train.getIntoTrain(pass);
	        	   
			}
	
	
}
