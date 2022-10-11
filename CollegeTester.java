class CollegeTester{

            public static void main(String a[]){
				
				College col = new College();
			    col.name = "Maharanis";
				col.location = "GandhiNagar";
				col.fees = 20000;
				col.branch = "Commerce";
				col.study();
				System.out.println(col.name+ " " + col.location + " " + col.fees + " " + col.branch);
				
				College col1 = new College();
			    col1.name = "KLE";
				col1.location = "Rajajinagar";
				col1.fees = 30000;
				col1.branch = "Law";
				col1.study();
				System.out.println(col1.name+ " " + col1.location + " " + col1.fees + " " + col1.branch);
				
				College col2 = new College();
			    col2.name = "MLAC";
				col2.location = "Malleshwaram";
				col2.fees = 35000;
				col2.branch = "Microbiology";
				col2.study();
				System.out.println(col2.name+ " " + col2.location + " " + col2.fees + " " + col2.branch);
				
				College col3 = new College();
			    col3.name = "REVA";
				col3.location = "Yelahanka";
				col3.fees = 50000;
				col3.branch = "MBA";
				col3.study();
				System.out.println(col3.name+ " " + col3.location + " " + col3.fees + " " + col3.branch);
			   
			    College col4 = new College();
			    col4.name = "MS Ramaiah";
				col4.location = "Bel road";
				col4.fees = 60000;
				col4.branch = "Pharmacy";
				col4.study();
				System.out.println(col4.name+ " " + col4.location + " " + col4.fees + " " + col4.branch);
			
			
			
			
			
			}














}