class ConventionHallTester{

                  public static void main(String args[]){
				  
				  ConventionHall con = new ConventionHall();
				  con.name = "MvM hall";
				  con.location = "Nelamangala";
				  con.community = "Hindu";
				  con.floors = 1;
				  con.marriage();
				  System.out.println(con.name + " " + con.location + " " + con.floors  + " " + con.community);
				  
				  ConventionHall con1 = new ConventionHall();
				  con1.name = "Bunts sangha";
				  con1.location = "Vijayanagar";
				  con1.community = "Bunts";
				  con1.floors = 2;
				  con1.marriage();
				  System.out.println(con1.name + " " + con1.location + " " + con1.floors  + " " + con1.community);
				  
				  ConventionHall con2 = new ConventionHall();
				  con2.name = "jain Associaton";
				  con2.location = "shankarapura";
				  con2.community = "jains";
				  con2.floors = 2;
				  con2.marriage();
				  System.out.println(con2.name + " " + con2.location + " " + con2.floors  + " " + con2.community);
				  
				  ConventionHall con3 = new ConventionHall();
				  con3.name = "Gayatri mandira";
				  con3.location = "Yelahanka";
				  con3.community = "Brahmins";
				  con3.floors = 1;
				  con3.marriage();
				  System.out.println(con3.name + " " + con3.location + " " + con3.floors  + " " + con3.community);
				  
				  ConventionHall con4 = new ConventionHall();
				  con4.name = "Jayadeva";
				  con4.location = "Nelamangala";
				  con4.community = "lingayath";
				  con4.floors = 2;
				  con4.marriage();
				  System.out.println(con4.name + " " + con4.location + " " + con4.floors  + " " + con4.community);
				  
				  
				  
				  
				  }













}