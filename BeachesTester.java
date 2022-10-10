class BeachesTester{


               public static void main(String args[]){
			   
			   
			   Beaches.addBeachNames("marina");                       // null,empty
			   Beaches.addBeachNames("malpe");                           //default values taken as null
			   Beaches.addBeachNames("gokarna");
			   Beaches.addBeachNames("baga");                         // == is executed only in the if condition
			   Beaches.addBeachNames("echo ");
			   Beaches.addBeachNames("Mangalore");
			   Beaches.getBeachNames();
               Beaches.findBeachNames("baga");                                                        //search operation to find beach
			   
			   Beaches.updateBeachName("Paradise","marina");
               Beaches.updateBeachName("marijim",2);
               Beaches.getBeachNames();			   
			   
			   
			   
			   
			   
			   
			   
			   }



















}