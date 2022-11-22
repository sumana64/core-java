package com.xworkz.relationship.supplementary;

import com.xworkz.relationship.exam.Exam;
import com.xworkz.relationship.exam.HallTicket;

public class Supplementary extends Exam {

	    public int noOfAttempts;
	     
	     public Supplementary(int noOfAttempts) {
	    	 
	    	 this.noOfAttempts = noOfAttempts;
	    
	     }
	    @Override
	    public boolean allow(HallTicket hallTicket) {
	    	System.out.println("Invoked allow method of supplementary");
	    	if(noOfAttempts>1) {
	    		
	    	     return super.allow(hallTicket);
	    	}
	    	
              return false;
	    }
	
	
	
}
