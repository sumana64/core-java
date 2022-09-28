class Stadium{

                   static String stadium[]={null,null,null,null,null,null,null};
				   
				   static int index;
				   
				   public static boolean addStadiumNames(String names){
				   
				     System.out.println("inside the addStadiums method");
					 
					     stadium[index++] = names;
				   
				   
				      System.out.println("end of the addStadiums method");
				     
					 return true;
				   
				   }
				   
				   public static void getStadiumNames(){
				   
				       for(int i=0;i<stadium.length;i++){
					   
					     
						 String ref = stadium[i];
						 
						 System.out.println("the stadium is :" + ref);
					   
					   }
				   
				   
				   
				   
				   
				   }
				   





















}