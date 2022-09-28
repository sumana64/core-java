class Airports{

               static String Airports[] = {null,null,null,null,null,null,null};
			   
			   static int index = 0;

              static boolean airportNames(String names){
			  
			         System.out.println("inside the airportNames method");
			  
			             Airports[index++] = names;
			  
			         System.out.println("end of the airportNames method");
			  
			          return true;



			 }
	               static boolean getAirportNames(){
			  
			  
			    for(int i=0;i<Airports.length;i++){
				
				
				     String ref = Airports[i];
					 System.out.println("the Airportnames is :" + ref);
				
				}
				return true;
				
			  
				   }
			  
			  
			  
			  
			  
			  





}