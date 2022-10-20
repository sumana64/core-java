package com.xworkz.footware;

public class FootwearTester {

	                  public static void main(String[] args) {
						
	                	 Footwear.brand = "Khadim's";
	                	 
	                	 Footwear foot = new Footwear("Casual","navy","Synthetic",600);
	                	 System.out.println(foot.type + " " + foot.color + " " + foot.material + " " + foot.price);
	                	 System.out.println(Footwear.brand);
	                	  
	                	 Footwear foot1 = new Footwear("sportwear","blue","fabric",800);
	                	 System.out.println(foot1.type + " " + foot1.color + " " + foot1.material + " " + foot1.price);
	                	 System.out.println(Footwear.brand);
	                	  
	                	 Footwear foot2 = new Footwear("officewear","brown","leather",1000);
	                	 System.out.println(foot2.type + " " + foot2.color + " " + foot2.material + " " + foot2.price);
	                	 System.out.println(Footwear.brand);
	                	  
	                	 Footwear foot3 = new Footwear("partywear","gold","valvet",1500);
	                	 System.out.println(foot3.type + " " + foot3.color + " " + foot3.material + " " + foot3.price);
	                	 System.out.println(Footwear.brand);
	                	  
	                	  
					}
	
	
	
	
	
	
	
	
	
	
	
	
}
