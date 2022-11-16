package com.xworkz.relationship.bank;

import com.xworkz.relationship.Type.Type;

public class Account {
	
	     public String accountName;
	     public String ifscCode;
	     public Type type;
	     public String address;
	 
	     
	     public Account(String accountName,String ifscCode,Type type,String address) {
	    	 
	    	 this.accountName = accountName;
	    	 this.ifscCode = ifscCode;
	    	 this.type = type;
	    	 this.address = address;
	    	 
	     } 
	    
	     public void display() {
	    	 
	    	System.out.println("the accountName is:" + this.accountName);
	    	System.out.println("the ifscCode is:" + this.ifscCode);
	    	System.out.println("the type is:" + this.type);
	    	System.out.println("the address is:" + this.address);
	    	
	     }
	     
	       

}
