class Stadium{

                   static String stadium[]={null,null,null,null,null};
				   
				   static int index;
				   
				   public static boolean addStadiumNames(String name){
				   
				     System.out.println("inside the addStadiums method");
					 
					 if(stadium.length>index && name!=null){
					                      
					     stadium[index++] = name;
				   
				   
				      System.out.println("end of the addStadiums method");
				     
					 return true;
					 }
					 else{
						 
						 System.out.println("name cannot added");
					      return false;
					}
					 
				   }
				   
				   public static void getStadiumNames(){
				   
				       for(int i=0;i<stadium.length;i++){
					   
					     
						 String ref = stadium[i];                                       //{major error due to this};
						 
						 System.out.println("the stadium is :" + ref);
					   
					   }
				   }
					
					static void findStadiumName(String name){
						   
						   for(int i=0;i<stadium.length;i++){
							   
							   if(name!=null && stadium[i]==name){
								   
								  System.out.println("the stadium is :" + stadium[i]); 
								   
							   }
							   
						   }
						   
						   
					   }
					   
					   static boolean updateStadiumName(String newName,String oldName){
						   
						   if(newName!=null && oldName!=null){
							   
							   for(int i=0;i<stadium.length;i++){
								   
								   if(stadium[i]==oldName){
									   
									 System.out.println("the oldName is :" + oldName);  
									   stadium[i]=newName;
									   
									   System.out.println("the newname is:" + newName);
								        return true;
								   }

								   }
							    }
						   
						   return false;
						 
						 
						 }
						 static boolean updateStadiumName(String newName,int existingIndex){
							 
							 if(newName!=null && existingIndex>=0){
								 
								 for(int i=0;i<stadium.length;i++){
									 
									 if(i==existingIndex){
										 
										System.out.println("the oldName is :" + stadium[i]);

                                         stadium[i]	= newName;

                                         System.out.println("the newName is :" + newName);										 
										 return true;
										 
										 
										 
									 }
									 
									 
									 
								 }
								 
							}
						return false;	 
					 }
				   
				   
				   
				   
				   
				   
				   





















}