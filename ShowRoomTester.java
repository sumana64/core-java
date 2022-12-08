package com.xworkz.crud2;

import java.util.Scanner;

import com.xworkz.crud2.Gender.Gender;
import com.xworkz.crud2.showroom.Manager;
import com.xworkz.crud2.showroom.ShowRoom;

public class ShowRoomTester {

	           public static void main(String[] args) {
				
	        	   
	        	Scanner sc = new Scanner(System.in);
	        	
	        	System.out.println("enter the size:");
	        	
	        	    int size = sc.nextInt();
	        	   
	        	   
	            ShowRoom showRoom = new ShowRoom(size);   
	        	   
	        	   
	        	   for (int i = 0; i < size; i++) {
					
	        	  Manager manager = new Manager();
	        	  System.out.println("enter the name:");
	        	  manager.setName(sc.next());
	        	  System.out.println("enter the address:");
	        	  manager.setAddress(sc.next());
	        	  System.out.println("enter the gender:");
	        	  String gender = sc.next();
	        	  manager.setGender(Gender.valueOf(gender));
	        	  System.out.println("enter the age:");
	        	  manager.setAge(sc.nextInt());
	        	  
	        	  showRoom.addManagers(manager);
	        	 
	        		   
				   }
	        	   
	        	   System.out.println("enter the name:");
	        	   showRoom.getManagerName(sc.next());
	        	   
	        	   //showRoom.getManagersDetails();
	        	   
	        	   System.out.println("enter the manager name:");
                   String name = sc.next();
                   System.out.println("enter the manager new address");
                   String address = sc.next();
                   boolean ref = showRoom.updateManagerAddressByName(name, address);
	        	  
                   System.out.println("enter the manager name to delete");
                   String name2 = sc.next();
                   showRoom.deleteManagerByName(name2);
                   showRoom.getManagersDetails();
                   showRoom.getAllNewManager();
                   
	        	  
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
	        	   
			}
	
	
	
	
	
	
	
	
}
