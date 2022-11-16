package com.xworkz.relationship.bank;

public class Bank {

	      public Account account;
	      public  boolean isAdharCard;
	      public  boolean isPanCard;
	      
	      public boolean CreateAccount(Account account) {
	    	  boolean isCreated = false;
	    	  System.out.println("inside the create account");
	    	  if(isAdharCard == true) {
	    		 if(isPanCard == true)  {
	    			this.account = account;
	    			this.account.display();
	    			System.out.println("the account is created");                  
	    			isCreated = true;                                             
	    		 }else {
	    			 
	    			 System.out.println("pancard is not provided");
	    		 }
	    		  
	    		  
	    	  }else {
	    		  
	    		  System.out.println("the account is  not created");
	    	  }
	    	  
	    	  
	    	  return isCreated;
	    	  
	      }
	      
	      
	
	
	
}
