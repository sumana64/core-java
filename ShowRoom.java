package com.xworkz.crud2.showroom;

public class ShowRoom {

	         public Manager[] managers;
	         
	         Manager[] newManager;
	         
	         public int index;
	         
	         public ShowRoom(int size) {
	        	 
	        	 managers = new Manager[size];
	        
	         }
	         
	         public boolean addManagers(Manager manager) {
	        	  
	        	   boolean isAdded = false;
	        	 
	        	 System.out.println("inside the addpatient method");
	        	 
	        	 if(manager!=null) {
	        		 
	        		 managers[index++] = manager;
	        		 
	        		 isAdded = true;
	        	 }
	        	 
	        	 return isAdded;
	         }
	         
	         public void getManagersDetails() {
	        	 
	        	 System.out.println("inside the manager details");
	        	 
	        	 for (int i = 0; i < managers.length; i++) {
					
	        		 System.out.println(managers[i].getName() + " " + managers[i].getAge() + " " + managers[i].getAddress() + managers[i].getGender());
				
	        	 }
	         }
	        	
	           public void getManagerName(String name) {
	            	  
	            	 System.out.println("inside the get manger name method");
	            	  
	            	  for (int i = 0; i < managers.length; i++) {
						
	            	 if(managers[i].getName().equals(name)) {
	            			 
	     	        System.out.println(managers[i].getName() + " " + managers[i].getAge() + " " + managers[i].getAddress() + managers[i].getGender());
	     				 
	            			  
	            		  }
	            		  
					}
	            	  
	            	  
	              }
	           
	           public boolean updateManagerAddressByName(String name, String newPatientAddress) {
	            	  
          	     boolean isUpdated = false;
          	     
          	     System.out.println("inside the updatepatientaddress by name");
          	     
          	     System.out.println("no of parameters: 1)String name 2)String address");
          	
          	     for (int i = 0; i < managers.length; i++) {
						
          	    	  if(managers[i].getName().equals(name)) {
          	    		  
          	    	 managers[i].setAddress(newPatientAddress);
          	    		  
          	    		  isUpdated = true;
          	    		  
          	    	  }
					  }
          	
                return isUpdated;	            	
              }
	           
	            
	            public boolean deleteManagerByName(String name) {
	            	
	            	 boolean isDeleted= false;
	            	 
	            	 newManager = new Manager[managers.length-1];
	            			 
	                   for (int i = 0, k=0 ; i < managers.length; i++) {
						
					        if(!managers[i].getName().equals(name)) {
					        	   
					        	 newManager[k++] = managers[i];
					        	   
					        	   isDeleted = true;
					           }
	                   
	                   }
	            	 
	                   return isDeleted;    
	            }
	            
	            public void getAllNewManager() {
	            	
	            	System.out.println("list of all the patients");
	            	
	            	for (int i = 0; i < newManager.length; i++) {
						
	            		System.out.println(managers[i].getAge() + " " + managers[i].getGender() + " " + managers[i].getName() + " " + managers[i].getAddress());
	            		
					}
	            }
	            
          
	            	  
	            	  
	            	  
	            	  
	              
	        			   
	        			   
	        			   
	        			   
	        			   
	        		 
	           
	           
	        		
	        		

	        	 
	        	 
	        	 
	         
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
