package com.xworkz.relationship;

import com.xworkz.relationship.exam.Exam;
import com.xworkz.relationship.exam.HallTicket;

public class ExamTester {

	     public static void main(String[] args) {
			
	     String[] subjectNames = {"m1","os","testing","vlsi"};	 
	     HallTicket hallTicket = new HallTicket("Sneha",subjectNames,"1KT13IS031","VTU"); 
	     Exam exam = new Exam();
         exam.fees = 1200;
	     boolean isAllowed = exam.allow(hallTicket);
	     System.out.println("th candidate is allowed: " + isAllowed);
	     
	    
	    	 
	    	 
		}
	
	
}
