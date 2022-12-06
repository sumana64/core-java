class Fdigit{

            public static void main(String a[]){
			
			int no= 65242;
			int remainder = 0;
			int key = 6;
			int count=0;
			
			
			  while(no>0){
				  
				   remainder= no%10;
				   no = no/10;
                 
                   if(key == remainder){
					   
					   count++;
					   
					   
				   }
			
			  }
	        System.out.println("the frequency of no is : "+ count);

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}

















}