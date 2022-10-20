package com.xworkz.iceCream.icecreamParlour;

public class IceCreamParlour {

	
	                public String name;
	                public String address;
	                public String gstNo;
	                public int noOfStaff;
	                public String menu[];
	                public String branches[];
	                public String staffNames[];
	                public String billing[];
	           
	           
	            public IceCreamParlour() {   //default Constructor
	        	    
	        	   System.out.println("the iceCream parlour is created");
	        	   
	            }
	                                                                                                                          //parameterized constructor
	            public IceCreamParlour(String name,String address,String gstNo,int noOfStaff,String menu[],String branches[],String staffNames[],String billing[]) {
	        	   
	        	   this.name = name;
	        	      this.address = address;
	        	      this.gstNo = gstNo;
	        	      this.noOfStaff = noOfStaff;
	        	      this.menu = menu;
	        	      this.branches = branches;
	        	      this.staffNames = staffNames;
	        	      this.billing = billing;
	        	   
	              }
	           
	            public void displayInfo() {
	        	       
	            	   System.out.println("the name is:" + name);
	        	       System.out.println("=============================");
	        	       System.out.println("the address is:" + address);
	        	       System.out.println("=============================");
                       System.out.println("the gstNo is :" + gstNo);
	        	       System.out.println("=============================");
                       System.out.println("the no of staff is :" + noOfStaff);
	        	       System.out.println("=============================");
                       System.out.println("the menu list");
	        	       for (int i = 0; i < menu.length; i++) {
	        	    	   
	        	    	   System.out.println(menu[i]);					
					   }
	        	       System.out.println("=============================");
                       System.out.println("the list of branches");
                       for (int i = 0; i < branches.length; i++) {
						
                    	   System.out.println(branches[i]);
					   }
	        	       System.out.println("=============================");
	        	       System.out.println("list of staffNames");
	        	       for(int i=0;i<staffNames.length;i++) {
	        	    	   
	        	    	   System.out.println(staffNames[i]);
	        	       }
	        	       System.out.println("=============================");
                       System.out.println("list of billingMethod");
                       for (int i = 0; i < billing.length; i++) {
						
                    	   System.out.println(billing[i]);
					   }

	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	           }
	           
	
	
	
	
	
	
}
