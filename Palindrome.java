class Palindrome{

                public static void main(String args[]){
				
				  int num = 111;
				  int rev =0;
				  int backup = num;
				  
				  while(num!=0){
				  
				  rev = rev*10 + num%10;  
				  num = num/10;
				  
				  }
			
				 if(backup==rev){
					 
					 
					System.out.println("the no is palindrome"); 
					 
				 } 
					 
				else{
					
					
					System.out.println("the no is not palindrome");
				}	 
				 
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}


















}