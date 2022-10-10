class Airports{

               static String airports[] = {null,null,null,null,null,null};
			   
			   static int index = 0;

              static boolean airportNames(String names){
			  
			         System.out.println("inside the airportNames method");
					 
					 if(airports.length>index && names!=null){
			  
			             airports[index++] = names;
			  
			         System.out.println("end of the airportNames method");
			  
			          return true;
					 } else{
						 
						 System.out.println("cannot add airport names");
					         return false;
					 }
					 


			 }
	               static void getAirportName(){
			  
			  
			    for(int i=0;i<airports.length;i++){
				
				
				     String ref = airports[i];
					 System.out.println("the Airportnames is :" + ref);
				
				}
		
				
			  
				   }
				   static void findAirportNames(String names){
					   
					   for(int i=0;i<airports.length;i++){
						   
						   if(names!=null && airports[i]==names){
							   
							   String ref = airports[i];
						   
						   System.out.println("the airport name is:" + ref);
						   
						   }
					  
                         }
						 
				   }
						 
						 static boolean updateAirportName(String oldName
						 ,String newName){
							 
							 System.out.println("inside the updateAirportName method");
							 
							 if(oldName!=null && newName!=null){
								 
								 for(int i=0;i<airports.length;i++){
									 
									 if(airports[i]==oldName){
										 
										 System.out.println("the old name is:" + oldName);
										 
										 airports[i] = newName;
										 
										 System.out.println("the newName is :" + newName);
										 return true;
										 
										 
									 }
									 
									 
								 }
								 
								 
								 
								 
								 
							 }
							 return false;
							 
					 }
					 
                    static boolean updateAirportName(String newName,int existingIndex){
						
						System.out.println("inside the updateAirportName method20");
						  
						  if(newName!=null && existingIndex!=0){
							   
							   for(int i=0;i<airports.length;i++){
								   
								   if(i == existingIndex){
									   
									   System.out.println("the oldName is :" + airports[i]);
									   
									   airports[i]= newName;
									   
									   System.out.println("the newName is :" + newName);
									   
									      return true;
									   
								   }
								   
								   
								 }
							   
							   
							   
						}
					return false;	
				}					 
					   
					   
					   
					   
					   
					   
				   
			  
			  
			  
			  
			  
			  





}