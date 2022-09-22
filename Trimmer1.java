class Trimmer1{

               public static void main(String a[]){
			   
			     String name = "P3 Trimmer";
				 String brandName = "Vega";
				 String color = "Black";
				 int price = 999;
				 
				 String chargingTime = "6 to 8 hrs";
				 String runTime = "45 min";
				 String powerSource = "USB charging cable";
				 String length = "16mm";
				 String display = "LED";
				 
				 String totalSettings[] = {chargingTime,runTime,powerSource,length,display};
				 
				 String ref0 = totalSettings[0];
				 String ref1 = totalSettings[1];
				 String ref2 = totalSettings[2];
				 String ref3 = totalSettings[3];
				 String ref4 = totalSettings[4];
				 
				 System.out.println("\nThe name of the Trimmer is " + name);
				 System.out.println("The brandname of the trimmer is " + brandName);
				 System.out.println("The color of the trimmer is " + color);
				 System.out.println("The price of the trimmer is " + price);
				 
				 System.out.println("\nThe totalSettings index 0 : " + ref0);
				 System.out.println("The totalSettings index 1 : " + ref1);
                 System.out.println("The totalSettings index 2 : " + ref2);
                 System.out.println("The totalSettings index 3 : " + ref3);
                 System.out.println("The totalSettings index 4 : " + ref4);
				 
				 System.out.println("\nThe length of the totalSettings is " + totalSettings.length);
				 
				 for(int t=0; t<totalSettings.length; t++){
				       
					   String ref = totalSettings[t];
					   
					   System.out.println(totalSettings[t]);
				 
				 }
				 
				 
             				 
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   }
















}