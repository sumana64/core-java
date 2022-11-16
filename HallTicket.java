package com.xworkz.relationship.exam;

public class HallTicket {

	    public String name;
	    public String[] subjectNames;
	    public String usnNo;
	    public String universityName;
	    
	    public HallTicket(String name,String[] subjectNames,String usnNo, String universityName) {
	    	
	    	System.out.println("the hallticket object is created");
	    	this.name = name;
	    	this.subjectNames = subjectNames;
	    	this.usnNo = usnNo;
	    	this.universityName = universityName;
	    	
	    }
	    
	     public void displayDeltails() {
	    	
	    	System.out.println("the candidate name is:"  +this.name);
	    	System.out.println("the usnNo is:" + this.usnNo);
	    	System.out.println("the universityname is:" + this.universityName); // this is also used to invoke the class members no only instance variable
	    	System.out.println("th list of subjects");
	    	for (int i = 0; i < subjectNames.length; i++) {
			System.out.println(subjectNames[i]);
			
	    	}
	    	
	    	
	    }
	
}
