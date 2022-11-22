package com.xworkz.relationship;

import com.xworkz.relationship.exam.Exam;
import com.xworkz.relationship.exam.HallTicket;
import com.xworkz.relationship.supplementary.Supplementary;

public class ExamTester {

	     public static void main(String[] args) {
			
	     String[] subjectNames = {"m1","os","testing","vlsi"};	 
	     HallTicket hallTicket = new HallTicket("Sneha",subjectNames,"1KT13IS031","VTU"); 
	     Exam exam = new Exam();
         exam.fees = 1200;
	     boolean isAllowed = exam.allow(hallTicket);
	     System.out.println("th candidate is allowed: " + isAllowed);
	     
	     System.out.println("the exam behaving as supplementary");
	     Exam exam1 = new Supplementary(2);
	     exam1.fees = 1300;
	     exam1.allow(hallTicket);
	     
	    	 
		}
	
	
}
