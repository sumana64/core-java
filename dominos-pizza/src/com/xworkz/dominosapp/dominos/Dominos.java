package com.xworkz.dominosapp.dominos;

public class Dominos {

	         public String branch;
	         public String section;
	         public String gstNo;
	         public int noOfStaff;
	         public String menu[];
	         public String staffNames[];
	         public long contactNo[];
             public String billingMethods[];	      
	              
	
	         public Dominos(){
	        	 
	        	 System.out.println("dominos constructor is created");
	         }
	
	        public Dominos(String branch,String section,String gstNo,int noOfStaff,String menu[],String staffNames[], long contactNo[],String billingMethods[]) {
	        	
	        	this.branch = branch;
	        	this.section = section;
	        	this.gstNo = gstNo;
	        	this.noOfStaff = noOfStaff;
	        	this.menu = menu;
	        	this.staffNames = staffNames;
	        	this.contactNo = contactNo;
	        	this.billingMethods = billingMethods;
	        	
	        	
	        	
	        	
	        }
	        
	        public void displayInfo() {
	        	
	        	System.out.println("the branch is:" + branch);
	        	System.out.println("======================");
                System.out.println("the section is :" + section);
	        	System.out.println("====================");
	        	System.out.println("the gstNo is :" + gstNo);
	        	System.out.println("======================");
                System.out.println("the list of menu");
	        	for(int i=0;i<menu.length;i++) {
                	
                	System.out.println(menu[i]);
                }
	        	System.out.println("======================");
                System.out.println("the list of staffNames");
                for(int i=0;i<staffNames.length;i++) {
                	
                	System.out.println(staffNames[i]);
                }
	        	System.out.println("======================");
                System.out.println("the list contactNo");
                for(int i=0;i<contactNo.length;i++) {
                	
                	System.out.println(contactNo[i]);
                }
	        	System.out.println("======================");
                System.out.println("the list of billingMethods");
                for(int i=0;i<billingMethods.length;i++) {
                	
                	System.out.println(billingMethods[i]);
                }
	        	
	        	
	        	
	        }
	
	
	
	
	
	
	
	
	
	
	
	
}
