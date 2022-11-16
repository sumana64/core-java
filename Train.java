package com.xworkz.relationship.train;

public class Train {
           
	  public Passengers passengers;
	  public String name;
	  public String stand;
	  public boolean isPaid;
	  public boolean isTicketgot;
	  public boolean isSeatReserved;
	  
	  public Train(String name,String stand) {
		  
		  this.name = name;
		  this.stand = stand;
	 
	  }
	  
	  public boolean getIntoTrain(Passengers passengers) {
		  boolean isSetteled = false;
		  if(isPaid == true) {
			  System.out.println("th amount is paid");
			  if(isTicketgot == true) {
				  System.out.println("the ticket is  received");
				  if(isSeatReserved == true){
					 // this.passengers.display(); // we should not use the display before the intializing the passengers
					  this.passengers = passengers;
					  this.passengers.display();
					  System.out.println("the passengers got seat in the train");
					  isSetteled = true;
				  }else {
					  System.out.println("the seat is not reserved in the train");
				  }
			  }else {
				  System.out.println("the ticket is not reserved");
			  }
		  }else {
			  System.out.println("the amount is not paid");
		  }
		  return isSetteled;
		  
	  }
}
