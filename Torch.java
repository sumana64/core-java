class Torch{

            static String brandName;
			static String color;
			static int price;
			static boolean isConnected;
			static int maxVolume = 10;
			static int currentVolume;
			static int minVolume;
			
			public static boolean onOrOff(){
			
			  System.out.println("onOrOff starts");
			  
			  if(isConnected == false){
			  
			           isConnected = true;
					   

				System.out.println("the torch is on.....");
			}
			
			 else if(isConnected == true){
			   
			             isConnected = false;
						 System.out.println("the torch is off");
			   
			   
			   }
			   System.out.println("onOrOff ends");
			    return isConnected;
			}
			
			public static void increaseVolume(){
				
				System.out.println("inside increaseVolume");
				
				if(isConnected == true){
					
					if(currentVolume<maxVolume){
						
						currentVolume = currentVolume + 1;
						System.out.println("the maxSpeed is " + currentVolume);
						
						
					}
					else{
						
						System.out.println("maxSpeed is reached..");
					}
				}
				else{
					
					System.out.println("torch is turned off");
				
				}
				
		}
			public static void decreaseVolume(){
				
				System.out.println("inside decreaseVolumeVolume");
				
				if(isConnected == true){
					
					if(currentVolume > minVolume){
						
						currentVolume = currentVolume-1;
						System.out.println("minVolume is :  " + currentVolume);
						
						
					}
					else{
						
						System.out.println("minVolume is reached...");
					}
				}
				else{
					
					System.out.println("torch should be turned on");
				}
				
			}
			
			
			
			
			












}