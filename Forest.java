class Forest{

           public static void main(String args[]){
		   
		     String name = "Savanadurga";
			 String totalArea = "27 km";
			 String type = "Evergreen forest";
			 String region = "Magadi road";
			 
			 String name1 = "Elephant";
			 String name2 = "Deer";
			 String name3 = "Rabbits";
			 String name4 = "Bear";
			 String name5 = "Monkey";
			 
			 String primaryAnimals[] = {name1,name2,name3,name4,name5};
			 
			 String ref0 = primaryAnimals[0];
			 String ref1 = primaryAnimals[1];
			 String ref2 = primaryAnimals[2];
			 String ref3 = primaryAnimals[3];
			 String ref4 = primaryAnimals[4];
			 
		    System.out.println("the name of the forest is " + name);
			System.out.println("the totalarea of the forest is " + totalArea);
			System.out.println("the type of the forest is " + type);
			System.out.println("the region of the the is  " + region);
			 
			 
			System.out.println("\nthe primaryAnimals index 0: " + ref0);
			System.out.println("the primaryAnimals index 1: " + ref1);
			System.out.println("the primaryAnimals index 2: " + ref2);
			System.out.println("the primaryAnimals index 3: " + ref3);
			System.out.println("the primaryAnimals index 4: " + ref4);
			
			System.out.println("\nthe length of the primaryAnimals is " + primaryAnimals.length);
			
			for(int f=0;f<primaryAnimals.length;f++){
				 
				 String ref = primaryAnimals[f];
				System.out.println(primaryAnimals[f]);
			}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   }



















}