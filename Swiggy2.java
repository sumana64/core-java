class Swiggy2{

            public static double takeOrder(String item){
			
			
			if(item == "pizza"){
			
			  System.out.println("take the order " + item);
			     return 50.0;
			
			}
			if(item == "southindian"){
			
			  System.out.println("take the order " + item);
			       return 70.00;
				   
			
			}
			if(item == "burger"){
			  
			  System.out.println("take the order " + item);
			       return 60.00;
			}
			if(item == "mosaranna"){
			
			   System.out.println("take the order " + item);
			         return 30.00;
			}
			if(item == "frenchfries"){
			
			    System.out.println("take the order " + item);
			          return 40.00;
			}
			if(item == "pasteries"){
			
			    System.out.println("take the order " + item);
			             return 90.00;
			} 
			
			else{
				
				System.out.println("the order is not matching");
			}
			 
			 return 0.00;
			
			}
			
			public static double takeOrder(String item,int quantity){
			
			
			if(item == "pizza"){
			
			  System.out.println("take the order " + item);
			     return 50.0 * quantity;
			
			}
			if(item == "southindian"){
			
			  System.out.println("take the order " + item);
			       return 70.00 * quantity;
				   
			
			}
			if(item == "burger"){
			  
			  System.out.println("take the order " + item);
			       return 60.00 * quantity;
			}
			if(item == "mosaranna"){
			
			   System.out.println("take the order " + item);
			         return 30.00 * quantity;
			}
			if(item == "frenchfries"){
			
			    System.out.println("take the order " + item);
			          return 40.00 * quantity;
			}
			if(item == "pasteries"){
			
			    System.out.println("take the order " + item);
			             return 90.00 * quantity;
			} 
			
			else{
				
				System.out.println("the order is not matching");
			}
			 
			 return 0.00;
			
			}
			



}



















