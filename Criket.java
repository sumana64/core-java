class Criket{

             public static void main(String args[]){
			 
			  int rohitHighestScore = 263;
			  int sachinHighestScore = 200;
			  int mandannaHighestScore = 135;
			  int ackerrHighestScore = 232;
			  int bjClarkHighestScore = 229;
			  
			  int highestScore[] = {rohitHighestScore,sachinHighestScore, mandannaHighestScore ,ackerrHighestScore,bjClarkHighestScore};
			  
			  //variable returned from array element
			  
			   int ref0 = highestScore[0];
               int ref1 = highestScore[1];
               int ref2 = highestScore[2];
               int ref3 = highestScore[3];
               int ref4 = highestScore[4];
			   
			   System.out.println("Highest score index 0 " + ref0);
			   System.out.println("Highest score index 1 " + ref1);
			   System.out.println("Highest score index 2 " + ref2);
			   System.out.println("Highest score index 3 " + ref3);
			   System.out.println("Highest score index 4 " + ref4);
			   
			   //length is a property of array
			   
			   System.out.println("\nthe length of highestscore is " + highestScore.length);
			   
			   // for loop
			   
			   for(int index=0;index<highestScore.length;index++){
				   
				   int ref = highestScore[index];
				   System.out.println("Element at the index " +  index +" "+ ref);  
			   }
			   
			   

			   
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 }













}