class Ac{

         static String brandName;
		 static String color;
		 static int price;
		 static boolean isConnected;
		 static int maxVolume = 8;
		 static int minVolume;
		 static int currentVolume;
		 
		 
		 public static boolean onOrOff(){
		 
		   System.out.println("onOrOff starts");
		   
		   if(isConnected == false){
		   
		          isConnected = true;
		    System.out.println("the Ac is turned on...");
		   }
		 
		   else if(isConnected == true){
		   
		            isConnected = false;
			 System.out.println("the Ac is turned off...");
		   
		   
		   
		   }
		     System.out.println("onOrOff ends");
			 return isConnected;
		 
		 
		 }

             public static void increaseVolume(){
				 
				 System.out.println("inside increaseVolume ");
				 
				 if(isConnected == true){
					 
					 if(currentVolume < maxVolume){
						 
						 currentVolume = currentVolume + 1;
						 
						 System.out.println("maxVolume is : " + currentVolume);
						 
						 }
					 
					 else{
						 
						 System.out.println("maxVolume is reached");
					 }
				  
				  }
					 else{
						 
						 System.out.println("television is turned off");
					 }
					  
			 }  
				 
				 public static void decreaseVolume(){
					 
					 if(isConnected == true){
						 
						 if(currentVolume>minVolume){
							 
							 currentVolume = currentVolume - 1;
							 System.out.println("minVolume is " + currentVolume);
							 
							  }
						 
						 else{
							 
							 System.out.println("minVolume is reached");
							 
							 
						 }
						}
					 else{
						 
						 System.out.println("Ac is turned off");
					 }
					 
					 
					 
					 
					 
					 
					 
					 
				 }
				 
				 
				 
				 
			








			









}