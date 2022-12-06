class Large{

                static int large;
				static int secondLarge;
				static int count;

           public static void main(String args[]){
                  
				  int a[] = {1,2,3,4,50,6,7,80,9,10};
		 
				  
				  for(int i=0;i<a.length;i++){
				  
				     if(large<a[i]){
					   
					  secondLarge = large;
					  large = a[i];
					 
					 
					 }
					 
					else if (a[i]>secondLarge){
					
						 secondLarge = a[i];
						
						
						}
				  
				  
		  
		            }
				  
				  System.out.println("the largest no is:" + secondLarge);

				  
				  
				  
				  
				  
				  
				  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   }


















}

