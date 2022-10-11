class SolarSystemTester{

                public static void main(String args[]){
				
				SolarSystem sol = new SolarSystem();
				sol.planet = "Earth";
				sol.radius = "6,371 km ";
				sol.age = "4.543 billion" ;
				sol.gravity = "9.807m/s ";
				sol.creation();
				System.out.println(sol.planet + " " + sol.radius + " " + sol.age + " " + sol.gravity);
				
				SolarSystem sol1 = new SolarSystem();
				sol1.planet = "Jupitar";
				sol1.radius = "69,911 km ";
				sol1.age = "4.603 billion" ;
				sol1.gravity = "less gravity ";
				sol1.creation();
				System.out.println(sol1.planet + " " + sol1.radius + " " + sol1.age + " " + sol1.gravity);
				
				SolarSystem sol2 = new SolarSystem();
				sol2.planet = "Mars";
				sol2.radius = "3,389.3 km ";
				sol2.age = "4,374 billion" ;
				sol2.gravity = "less gravity";
				sol2.creation();
				System.out.println(sol2.planet + " " + sol2.radius + " " + sol2.age + " " + sol2.gravity);
				
				
				
				
				
				
				
				
				
				
				
				}

















}