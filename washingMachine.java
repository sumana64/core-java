class washingMachine{


               static String brandName;
			   static String color; 
			   static int price;
               static boolean isConnected;
			   static int maxSpeed = 8;
			   static int minSpeed;
			   static int currentSpeed;
			   
			   public static boolean onOrOff(){
			   
			   System.out.println("onOrOff starts");
			   
			   if(isConnected == false){
			   
			            isConnected = true;
					System.out.println("the washingMachine is turned on...");
			   
			   }
			   else if(isConnected == true){
				
				         isConnected = true;
				    System.out.println("the washingMachine is turned off...");
					
				
				}
				
				System.out.println("onOrOff ends");
			     return isConnected;
			   }
			   
			   public static void increaseSpeed(){
				   
				   System.out.println("inside incresespeed");
				   
				   if(isConnected == true){
					   
					   if(currentSpeed<maxSpeed){
						   
						   currentSpeed = currentSpeed + 1;
						   System.out.println("the maxSpeed is :" + currentSpeed);
						   
						   
					   }
					   else{
						   
						   System.out.println("maxSpeed is reached");
					   }
					 }
					 else{
					 System.out.println("Ac is turned off");
					 }
					 
				 }
				 
				 public static void decreaseSpeed(){
					 
					 System.out.println("inside decreaseSpeed");
					 
					 if(isConnected == true){
						 
						 if(currentSpeed > minSpeed){
						 
					     currentSpeed = currentSpeed -1;
						 System.out.println("minSpeed is:" + currentSpeed);
						 
					 }
					 else{
						 
						 System.out.println("minSpeed is reached");
						 
					 }
					 
					 }
					 else{
						 
						 System.out.println("WashinMachine is turned off");
					 }
					 
				 }
				 
				 
				 
               







}