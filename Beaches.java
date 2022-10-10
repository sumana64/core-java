class Beaches{

                                      
              static String beachNames[] = {null,null,null,null,null,null};                
			  
			  
			  static int index;
			                            
			 public static boolean addBeachNames(String beachName){
			  
			     System.out.println("inside the beach method");
				 
				 
				            if(beachNames.length > index && beachName!=null){   
							// <=,>,
								beachNames[index] = beachName;       
						          index++;
							 return true;
							}
							else{
				             
						    System.out.println("beach names exceeded");
							
                               
							   
	  
							}                  
								
				            System.out.println("end of the beach method");  
			  
			                                                             
	             return false;
			  
			}
			                 
		    public static void getBeachNames(){
				
		
				   
				   for(int i=0;i<beachNames.length;i++){  //fetching the data from the array
					    
							
						String ref = beachNames[i];
					   
					   System.out.println("the beach names are :" + ref);
					   
				   }
					
				
			}
			public static void findBeachNames(String beachName){
				
				for(int i =0;i<beachNames.length;i++){
				
				   if(beachName!= null && beachNames[i]==beachName){
					   
					   String ref = beachNames[i];
					   
					   System.out.println("the beach name is : " + ref);
					   
					   
					}
			 }
				
				
				
				
			}
			static boolean updateBeachName(String newBeachName,String oldBeachName){
				
				    System.out.println("the updatebeachaname method started");
					
					if(oldBeachName!=null && newBeachName!=null){
						
						for(int i=0;i<beachNames.length;i++){
							
							
							//beachNames[0] = marina
							// marina = marina
							// oldBeachName = marina
							if(beachNames[i] == oldBeachName){  // to check whether oldbeachname is present in array beaches
							
							System.out.println("the oldBeachName is :" + beachNames[i]);
							                              // beachNames[i] = marina
							beachNames[i] = newBeachName; // if it is present we are assaining newBeachName to oldbeachname
							                              // beachNames[i] = paradise
							System.out.println("the old beachNames");
							return true;
							
						}
						
						}
						
					}
					return false;	
			}
             
			 static boolean updateBeachName(String newBeachName,int existingIndex){  // we are passing index(location of particular data) instead of olddata
				  
				    System.out.println("inside the updateBeachName method");
					
					if(newBeachName!=null && existingIndex>0){
						
						  for(int index=0;index<beachNames.length;index++){
							  
							  if(index == existingIndex){
								  
								  System.out.println("the oldBeachName is :" + beachNames[index]);
								  
								 beachNames[index] = newBeachName;
								  
								  System.out.println("the newBeachName is :" + newBeachName);
								  return true;
							  }
					 
					 }
						
			}
				  
				  
	          return false;  
			  }			
					
				
				
				
				
				
				
				
				
				
			
			
					
	
								
						  
					   
					   
					   
				   
				
				
			
				
				
				
				
				
		
			  
			  
			  
			  















}