package com.xworkz.chatsapp.chatsShop;

public class ChatShop {

	
	          public String name;
	          public String address;
	          public String gstNo;
	          public int noOfcounters;
	          public String menu[];
	          public String staffNames[];
	          public long contactNo[];
	          public String billing[];
	          
	
	          public ChatShop() {                // default constructor
	    	 
	    	  System.out.println("chatshop constructor is created");
	          
	          }
	                                                                                                        //parameterized constructor
	          public ChatShop(String name,String address,String gstNo,int noOfcounters,String menu[],String staffNames[],long contactNo[],String billing[]) {
	        	  
	        	  this.name = name;
	        	  this.address = address;
	        	  this.gstNo = gstNo;
	        	  this.noOfcounters = noOfcounters;
	        	  this.menu = menu;
	        	  this.staffNames = staffNames;
	        	  this.contactNo = contactNo;
	        	  this.billing = billing;
	          }
	
	          public void dispaly() {
	        	  
	        	  System.out.println("the name is :" + name);
	        	  System.out.println("#####################");
	        	  System.out.println("the address is :" + address);
	        	  System.out.println("######################");
	        	  System.out.println("the gstNo is :" + gstNo);
	        	  System.out.println("#####################");
	        	  System.out.println("the no of counters:" + noOfcounters);
	        	  System.out.println("####################");
	        	  System.out.println("the menu list");
	        	  for (int i = 0; i < menu.length; i++) {
					  
	        		  System.out.println(menu[i]);
				  }
	        	  System.out.println("####################");
	        	  System.out.println("list of staffNames");
	        	  for (int i = 0; i <staffNames .length; i++) {
					
	        		  System.out.println(staffNames[i]);
				  }
	        	  System.out.println("####################");
	        	  System.out.println("list of contactNo");
	        	  for(int i=0;i<contactNo.length;i++) {
	        		  
	        		  System.out.println(contactNo[i]);
	        	  }
	        	  System.out.println("####################");
	        	  System.out.println("list of billingMethods");
	        	  for (int i = 0; i < billing.length; i++) {
					
	        		  System.out.println(billing[i]);
				}
	        	  
	          }
	
	
	
	
}
