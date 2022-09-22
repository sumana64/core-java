class Television{

              static String brandName;
			  static int price;
			  static String model;
			  static boolean isConnected;
			  static int maxVolume = 10;
			  static int minVolume;
			  static int currentVolume;
			  
			  public static void onOrOff(){
			   
			   System.out.println("onOrOff starts");
			   
			   if(isConnected == false){
			   
			            isConnected = true;
						
			      System.out.println("the television is turned on");
				  }
				  
				else if(isConnected == true){
				
				         isConnected = false;
						  
			       System.out.println("the television is turned off");
				
				
				}  
			     
				 System.out.println("onOrOff ends");
			    
			  
			  
			  
			  }
			  
			  public static void maxVolume(){
				  
				    System.out.println("inside maxVolume");
				   
				   if(isConnected == true){				   
					
					if(currentVolume < maxVolume){
						
						currentVolume = currentVolume + 1;
						
						System.out.println("the currentVolume is " + currentVolume);
						
						
					}
				    else{
						
						System.out.println("maxVolume is reached");
					}
				    
				   }
				  
				    else{
						
						System.out.println("television shoulb be turned on");
						
					
					}  
				  
				  
			  }
			  
			  public static void minVolume(){
				   
				   System.out.println("inside minVolume");
				   
				   if(isConnected == true){
					   
					     if(currentVolume > minVolume){
							 
							 currentVolume = currentVolume - 1;
							 
							 System.out.println("minVolume is : " + minVolume);
							 
							 
						 }
					     else{
							 
							 System.out.println("minVolume is reached");
						 }
					   
				   
					    }
						else{
						
						System.out.println("television shoulb be turned on");
				   
						}
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
			  }












}