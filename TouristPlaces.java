class TouristPlaces{

                 static String TouristPlaces[] ={null,null,null,null,null,null,null};
				 
				 static int index;
				 
				 public static boolean addTouristPlaces(String places){
				 
				      System.out.println("inside the addTouristPlaces method");
					  
					       TouristPlaces[index++] = places;
				 
				       System.out.println("end of the addTouristPlaces method");
				   
				     return true;
				 
				 
				 }
				 public static void getTouristPlaces(){
				 
				    for(int i=0;i<TouristPlaces.length;i++){
					
					String ref = TouristPlaces[i];

                    System.out.println("the TouristPlaces is : " + ref);					
					
					}
				 
				 
				 }
				 
				 
				 
				 












}