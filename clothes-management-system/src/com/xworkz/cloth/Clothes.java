package com.xworkz.cloth;

public class Clothes {

              static String brand;
              
              String type;
              String color;
              String material;
              int price;
              
              public Clothes(String type,String color,String material,int price) {
            	  
            	  System.out.println("clothes constructor is created");
            	  
            	  this.type = type;
            	  this.color = color;
            	  this.material = material;
            	  this.price = price;
            	  
              }
              
              public void toWear() {
            	  
            	  System.out.println("colthes are looking good");
            	  
            	  
              }
            	 
              
              public static void main(String[] args) {
					
            	  Clothes.brand = "Max";
            	  
            	  Clothes cl = new Clothes("shirt","white","cotton",500);
            	  System.out.println(cl.type + " " + cl.color + " " + cl.material + " " + cl.price);
            	  System.out.println(Clothes.brand );
            	  
            	  Clothes cl1 = new Clothes("dress","pink","rayon",800);
            	  System.out.println(cl1.type + " " + cl1.color + " " + cl1.material + " " + cl1.price);
            	  System.out.println(Clothes.brand );
            	  
            	  Clothes cl2 = new Clothes("pants","blue","polyster-cotton",1000);
            	  System.out.println(cl2.type + " " + cl2.color + " " + cl2.material + " " + cl2.price);
            	  System.out.println(Clothes.brand );
            	  
            	  Clothes cl3 = new Clothes("saree","blue","polyster",1500);
            	  System.out.println(cl3.type + " " + cl3.color + " " + cl3.material + " " + cl3.price);
            	  System.out.println(Clothes.brand );
            	  
            	  
            	  
            	  
				} 
            	  
            	  
            	  
              
































}

