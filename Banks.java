class Banks{


            static String banks[] = {null,null,null,null,null,null,null};
			
			static int index =0;

            public static boolean addBankNames(String names){
			
			System.out.println("inside the bankNames method");
			           
					   banks[index++] = names;
						
						
			System.out.println("outside the bankNames method");			
			     
			return true;
			}
			
			public static void getBankNames(){
			
			 for(int i =0;i<banks.length;i++){
			 
			    String ref = banks[i];
			 
			 System.out.println("the banks names is :"+ ref);
			 
			 }
			
			
			
			
			
			}
			
			





















}