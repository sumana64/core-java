class SunGlassesTester{


                public static void main(String args[]){
				
				SunGlasses sun = new SunGlasses();
				sun.brand = "Aligator";
				sun.color = "black";
				sun.type = "rectangle";
				sun.price = 500;
				sun.SunProtect();
				System.out.println(sun.brand + " " + sun.color + " " + sun.type + " " + sun.price);
				
				SunGlasses sun1 = new SunGlasses();
				sun1.brand = "Voyage";
				sun1.color = "gold";
				sun1.type = "round";
				sun1.price = 700;
				sun1.SunProtect();
				System.out.println(sun1.brand + " " + sun1.color + " " + sun1.type + " " + sun1.price);
				
				SunGlasses sun2 = new SunGlasses();
				sun2.brand = "WROGYN";
				sun2.color = "pink";
				sun2.type = "oval";
				sun2.price = 1000;
				sun2.SunProtect();
				System.out.println(sun2.brand + " " + sun2.color + " " + sun2.type + " " + sun2.price);
				
				SunGlasses sun3 = new SunGlasses();
				sun3.brand = "Criba";
				sun3.color = "grey";
				sun3.type = "Aviator";
				sun3.price = 400;
				sun3.SunProtect();
				System.out.println(sun3.brand + " " + sun3.color + " " + sun3.type + " " + sun3.price);
				
				SunGlasses sun4 = new SunGlasses();
				sun4.brand = "Vincent chase";
				sun4.color = "blue";
				sun4.type = "Wayfarers";
				sun4.price = 1500;
				sun4.SunProtect();
				System.out.println(sun4.brand + " " + sun4.color + " " + sun4.type + " " + sun4.price);
				
				
				}











}