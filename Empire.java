class Empire{
           
		   public static void main(String args[]){
		   
		             String type = "3 star";
					 String address = "Rajajinagar";
					 String managers[] = {"ravi","khushi","kavya","preethi","shiva"};
					 int noOfmanagaers = 5;
					 String foodMenu[] = {"Aloo parota","egg parota","Lemon rice","veg birayani","Fried rice","Noodels","veg manachuri","french fries","veg dosa","paneer butter masala","Dal fry","butter roti","onion dosa","Dry chapathi","wheat chapati"};
		   
		          System.out.println("welcome to Empire");
				  System.out.println("\nthe address of the hotel is : " + address);
				  System.out.println("\nlist of the managers");
				  
				  for(int m=0; m<managers.length; m++){
				  
				         System.out.println(managers[m]);
				  }
		   
		          System.out.println("\nno Of managers are : " + noOfmanagaers);
		          
				  System.out.println("\nlist of the foodmenu");
				  for(int f=0;f<foodMenu.length; f++){
				  
				         System.out.println(foodMenu[f] + " ");
				  
				  }
		   
		   
		   
		   
		   
		   
		   }












}