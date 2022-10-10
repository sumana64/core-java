class Banks{


            static String banks[] = {null,null,null,null,null};
			
			static int index =0;

            public static boolean addBankNames(String name){
			
			System.out.println("inside the bankNames method");
			
			if(banks.length>index && name!=null){
			           
					   banks[index++] = name;
						
						
			System.out.println("outside the bankNames method");			
			     
			return true;
			}else{
				
				System.out.println("cannot add bankNames");
			    return false;
			}
			
			}
			
			public static void getBankNames(){
			
			 for(int i =0;i<banks.length;i++){
			 
			    String ref = banks[i];
			 
			 System.out.println("the banks names is :"+ ref);
			 
			 }
			
			}
			
			static void findBankName(String name){
				
				for(int i=0;i<banks.length;i++){
					
					if(name!=null && banks[i]==name){
					
					System.out.println("the bank name is :" + banks[i]);
					
					}
				}
				
			}
            
             static boolean updateBankName(String newName,String oldName){
				 
				System.out.println("inside the updateBankName method");
					
					if(oldName!=null && newName!=null){
						
						for(int i=0;i<banks.length;i++){
							
							if(banks[i] == oldName){
								
								System.out.println("the oldname is :" + oldName);
								
								banks[i] = newName;
								
								System.out.println("the newname is :" + newName);
								return true;
							
							}
							
							
						}
						
						
						
						
					}
					return false;
			 }
			 
			 static boolean updateBankName(String newName,int existingIndex){
				 
				   if(newName!=null && existingIndex!=0){
					   
					   for(int i=0;i<banks.length;i++){
						   
						   if(i == existingIndex){
							  
                           System.out.println("the oldName is :" + banks[i]);
							   
							   banks[i] = newName;
							   
							System.out.println("the newName is :" + newName);
							return true;
							   
							   
							   
						   }							  
							   
							   
							   
						   }
						   
						   
						   
						   
						   
					   }
					   
					   
					 return false;  
				   }  
					   
}	   
					   
					   
				  
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 
					
					
					
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 			
				
				
				
			
			
			
			
			
			
			





















