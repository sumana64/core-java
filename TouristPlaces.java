class TouristPlaces{

                 static String touristPlaces[] ={null,null,null,null,null,null};
				 
				 static int index;
				 
				 public static boolean addTouristPlaces(String place){
				 
				      System.out.println("inside the addTouristPlaces method");
					  
					  if(touristPlaces.length>index && place!=null){
					  
					       touristPlaces[index++] = place;
				 
				       System.out.println("end of the addTouristPlaces method");
				   
				     return true;
					  }
					  else{
						  
						  System.out.println("touristPlace cannot be added");
					      return false;
					 } 
					  
				 
				 }
				 public static void getTouristPlaces(){
				 
				    for(int i=0;i<touristPlaces.length;i++){
					
					String ref = touristPlaces[i];

                    System.out.println("the TouristPlaces is : " + ref);					
					
					}
				 
				 
				 }
				 static void findTouristPlace(String place){
					 
					 for(int i=0;i<touristPlaces.length;i++){
						 
						 if(place!=null && touristPlaces[i]==place){
							 
							 System.out.println("the touristPlace is : " +touristPlaces[i]);
							 
						 }
						 
						 
					 }
					 
				 }
                  static boolean updateTouristPlace(String newData,String oldData){
					  
					   if(oldData!=null && newData!=null){
						   
						   for(int i=0;i<touristPlaces.length;i++){
							   
							   if(touristPlaces[i]==oldData){
								   
								   System.out.println("the olddata is:" + oldData);
								   
								   touristPlaces[i]=newData;
								   
								   System.out.println("the newdata is :" + newData);
								   return true;
								   }
							 }
						   }
					  
				return false;  
					  
				  }				  
					static boolean updateTouristPlace(String newData,int existingData){
						
						if(newData!=null && existingData>=0){
							
							for(int i=0;i<touristPlaces.length;i++){
								
								if(i==existingData){
								
								System.out.println("the oldData is :" + touristPlaces[i]);
								
								     touristPlaces[i] = newData;
									 
									 System.out.println("the newData is :" + newData);
								      return true;
								}
							}
						
						}
						
						return false;
					} 
					 
					 
					 
					 
				 
				 
				 
				 
				 












}