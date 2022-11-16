package com.xworkz.relationship.exam;

public class Exam {

	   public HallTicket hallTicket;
	   public int fees;
	    
	    public boolean allow(HallTicket hallTicket) {
	    	boolean isAllowed = false;
	    	
	    	System.out.println("inside the allow method");
	    	System.out.println("the fee is to be paid :" + this.fees);
	    	if(fees>=1200) {
	    	System.out.println("the fees is paid");
	    		if(hallTicket!=null) {
	    			this.hallTicket = hallTicket;
	    			System.out.println("Details of the candidate hallTicket");
	    			this.hallTicket.displayDeltails();
	    			isAllowed = true;
	    			System.out.println("hallticket is been issued: now ur allowed to write exam");
	    		}
	    		else {
	    			
	    			System.out.println("no hallticket is found");
	    		}
	    		
	    	}
	    	else {
	    		 System.out.println("first pay the fees");
	    		
	    	}
	    	
	    	return isAllowed;
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	
}
