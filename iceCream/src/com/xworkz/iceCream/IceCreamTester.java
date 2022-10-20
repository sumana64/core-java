package com.xworkz.iceCream;

public class IceCreamTester {

                public static void main(String[] args) {
					
                	IceCream.brand = "quality";
                	
                	IceCream ice = new IceCream("cone","chocolate","105ml",40);
                	System.out.println(ice.type +" " + ice.flavour + " " + ice.quantity + " " + ice.price);
                	System.out.println(IceCream.brand);
                	
               
                	IceCream ice1 = new IceCream("cup","vanila","125ml",50);
                	System.out.println(ice1.type +" " + ice1.flavour + " " + ice1.quantity + " " + ice1.price);
                	System.out.println(IceCream.brand);
                	
                
                	IceCream ice2 = new IceCream("tub","strawberry","1L",300);
                	System.out.println(ice2.type +" " + ice2.flavour + " " + ice2.quantity + " " + ice2.price);
                	System.out.println(IceCream.brand);
                	
                	IceCream ice3 = new IceCream("frozendessert","Oreo&cream","700ml",500);
                	System.out.println(ice3.type +" " + ice3.flavour + " " + ice3.quantity + " " + ice3.price);
                	System.out.println(IceCream.brand);
				}










}


