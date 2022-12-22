package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Malls {

	              public static void main(String[] args) {
					
	            	  
	              String mall1 = "OrionMall" ;
	              String mall2 = "MantriMall";
	              String mall3 = "GTWord mall";
	              String mall4 = "Nexsus";
	              String mall5 = "LotusMall";
	              String mall6 = "Royal Minakshi";
	              String mall7 = "Garuda";
	              String mall8 = "UB city";
	              String mall9 = "Mark mall";                                    // non premitive cannot be added to the collections
	              String mall10 = "City center";
	              String mall11 = "Bharath";
	              String mall12 = "Bengaluru";
	              String mall13 = "Elements mall";                                                            // it consist of dynamic storage
	              String mall14 = "S mall";
	              String mall15 = "Garuda swagath";
	              String mall16 = "Viviana";
	              String mall17 = "Infinte";
	              String mall18 = "Prozone mall";
	              String mall19 = "Inorbit";
	              String mall20 = "Korum";
	              String mall21 = "Metro junction";
	              String mall22 = "Neptune Magnet";
	              String mall23 = "Raghuleela";
	              String mall24 = "Pinnacle";
	              String mall25 = "CrossRoads";
	              String mall26 = "CMR central";
	              String mall27 = "PVP Square";
	              String mall28= "TrendSet";
	              String mall29 = "MGB felicity";
	              String mall30 = "ELante";
	              String mall31= "Centra";
	              String mall32 = "TDI jagath";
	              String mall33 = "Vegas";
	              String mall34 = "Pacific";
	              String mall35 ="Moments";
	              String mall36 = "Select city";
	              String mall37 = "DLF avenue";
	              String mall38 = "Unity one";
	              String mall39 = "MGF city";
	              String mall40 = "D mall";
	              
	              
	              Collection<String> collection= new TreeSet();
	              collection.add(mall1);
	              collection.add(mall2);
	              collection.add(mall3);
	              collection.add(mall4);
	              collection.add(mall5);                                          //it is explicit way of adding data by declaring and intializing the ref and using that reference
	              collection.add(mall6);                                            //ref is added as parameter that is element
	              collection.add(mall7);
	              collection.add(mall8);
	              collection.add(mall9);
	              collection.add(mall10);
	              collection.add(mall11);
	              collection.add(mall12);
	              collection.add(mall13);
	              collection.add(mall14);
	              collection.add(mall15);
	              collection.add(mall16);
	              collection.add(mall17);
	              collection.add(mall18);
	              collection.add(mall19);
	              collection.add(mall20);
	              collection.add(mall21);
	              collection.add(mall22);
	              collection.add(mall23);
				  collection.add(mall24);
	              collection.add(mall25);
	              collection.add(mall26);
	              collection.add(mall27);
	              collection.add(mall28);
	              collection.add(mall29);
	              collection.add(mall30);
	              collection.add(mall31);
	              collection.add(mall32);
	              collection.add(mall33);
	              collection.add(mall34);
	              collection.add(mall35);
	              System.out.println(collection.size());
	              
	              collection.clear();
	              
	              collection.add("Tr"); //it is implicit way of adding data- adding directly data in the sop
	              
	              System.out.println("collection after adding" + collection.size());
	              
	              collection.add(mall36);
	              collection.add(mall37);
	              collection.add(mall38);
	              collection.add(mall39);
	              collection.add(mall40);
	              
	              System.out.println(collection.size());
	              
	              
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
				}
	
	
	
	
	
	
	
	
	
	
}
