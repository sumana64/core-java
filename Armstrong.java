class Armstrong{                                        //1^3 + 5^3 + 3^3 = 153;

           public static void main(String args[]){
		   
		        int no = 145;
				int rem;
				int sum = 0;
				int backup = no;
				
				
				while(no > 0){
				
			       rem = no %10;                   // 153%10 = 3         //15%10 = 5            //1%10 = 1
				 sum = (rem*rem*rem) + sum;        // 3*3*3 + 0 = 27     // 5*5*5 + 27 = 152    // 1*1*1 + 152 = 153
				 
				         no = no/10;               //153/10 = 15        //15/10 = 1             //1/10 = 0
				
				                                       
				
				}
			
				if(backup == sum){                       
			  
			    System.out.println("the no is Armstrong");
			  
			   }
			   else{
			  
			   System.out.println("the no is not an Armstrong");
			  
		       }
			  
			  
			  
			  
			  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   }















}