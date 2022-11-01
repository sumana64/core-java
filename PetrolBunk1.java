package com.xworkz.overloading.conceptOverloading;

public class PetrolBunk1 {

        //instance variables/states/properties/fields
            public int id;
            public String name;
            public String location;
            public String workerNames[] = new String[7];

            
            public PetrolBunk1() {        // default constructor

            	
            	
            	System.out.println("Default constructor is created");
            }
            
            
            public PetrolBunk1(String workerNames[]) {
           	 
            this(234,"HP","Rajajinagar",workerNames); // calling parameterized constructor
           	 
           	System.out.println("one parameterized  constructor is created"); 
           	 
            }
            
         // parameterized constructor   
            public PetrolBunk1(int id,String name,String location,String[] workersName) {
           	
           	 // below statement is used for Constructor chaining 
           	this(); // calling default constructor
           	System.out.println("Calling parameterized constructor");
           	this.id = id;
           	this.name = name;
           	this.location = location;
           	this.workerNames = workersName;
           	
           	
            }
            
             public void display() {
            	
            	System.out.println("diplay() is invoked");
            	System.out.println(this.id + " " + this.name + " " + this.location); // (this is optional) -->	System.out.println(id + " " + name + " " + location);  

            	System.out.println("list of the workerNames");
            	for (int i = 0; i < workerNames.length; i++) {
					System.out.println(workerNames[i]);
				}
            	
            	
            	
            	
            }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
