class Speaker{

          static String brand;
		  static String color;
		  static int price;
		  static boolean isConnected;
		  static int minVolume;
		  static int maxVolume = 8;
		  static int currentVolume;
		  
		  public static boolean onOrOff(){
		   
		   System.out.println("inside onOrOff");
		   
		   // false == false
		   if(isConnected == false){                     
		       
			     isConnected = true;
				 
				 System.out.println("speaker is turned on");
				 
		  }
		   // isConnected = true
		 else  if(isConnected == true){
		   
		          isConnected = false;
				  
				  System.out.println("speaker is turned off");
		   
		   }
		  
		  		   System.out.println("end onOrOff");

		 		 return isConnected; 
		 
		 }
		  

           public static void increaseVolume(){
			   
			 if(isConnected == true){
				 
				 System.out.println("inside increase volume");
				 
				if(currentVolume < maxVolume){
					
					currentVolume = currentVolume + 1;
					
					System.out.println("the volume is " + currentVolume);
					
					
				} 
				 else{
					 
					 System.out.println("the maxVolume is reached");
					 
				 }
				 
				 }
				 
				 else{
				 
				 System.out.println("the speaker should be turned on...");
			   
				 }
				 
		   }
				 
				 
	             public static void decreaseVolume(){
					 
					 if(isConnected == true){
						  
						  
						System.out.println("inside decreaseVolume");

						if(currentVolume > minVolume){
							
							currentVolume = currentVolume - 1;
							
							System.out.println("decreaseVolume is " + currentVolume);
							
							
						}
						 
						 else{
							 
							 System.out.println("decrese volume is reached");
						 }
						 
					 
					    }
						else{
							
							System.out.println("speaker should be turned on....");
						}
					 
					 
					 
					 
					 
					 
				 }
			   
		   






}