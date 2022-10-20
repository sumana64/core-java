package com.xworkz.chatsapp;

import com.xworkz.chatsapp.chatsShop.ChatShop;

public class ChatShopTester {

	public static void main(String[] args) {
		
		    String menu[] = new String[3];
	        menu[0] = "panipuri";
	        menu[1] = "masalapuri";
	        menu[2] = "sev puri";
	        
	        String staffNames[] = new String[3];
	        staffNames[0] = "megha";
	        staffNames[1] = "Ravi";
	        staffNames[2] = "chandru";
	        
	        long contactNo[] = new long[3];
	        contactNo[0] = 9988004531L;
	        contactNo[1] = 9988004532L;
	        contactNo[2] = 9988004534L;
	        
	        String billing[] = new String[3];
	        billing[0] = "card";
	        billing[1] = "cash";
	        billing[2] = "phonepay";
	       
		    
		       
			ChatShop chat = new ChatShop("Sai rams","malleshwaram","ADF345687",2,menu,staffNames,contactNo,billing);
		       
		   
		       
		
		
		     chat.dispaly();
		
		
		       
		
		
		

	}

}
