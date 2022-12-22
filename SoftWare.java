package com.xworkz.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWare {

	            public static void main(String[] args) {
					
	            String company1 = "IBM";
	            String company2 = "Nokia";
	            String company3 = "Dell";
	            String company4 = "Infosys";
	            String company5 = "Oracle";
	            String company6 = "Infotech";
	            String company7 = "Microsoft";
	            String company8 = "Accenture";
	            String company9 = "Cordys";
	            String company10 = "Deloitte";
	            String company11 = "Wipro";
	            String company12 = "Mindtree";
	            String company13 = "TechMahindra";
	            String company14 = "Motorola";
	            String company15 = "Honeywell";	
	            String company16 = "Polarisis";
	            String company17 = "Mphasis";
	            String company18 = "HCL";
	            String company19 = "TCS";
	            String company20 = "L&T";	
	            
	            
	            Collection<String> ref = new ArrayList();
	            
	            ref.add(company20);
	            ref.add(company19);
	            ref.add(company18);
	            ref.add(company17);
	            ref.add(company16);
	            ref.add(company15);
	            ref.add(company14);
	            ref.add(company13);
	            ref.add(company12);
	            ref.add(company11);
	            ref.add(company10);
	            ref.add(company9);
	            ref.add(company8);
	            ref.add(company7);
	            ref.add(company6);
	            ref.add(company5);
	            ref.add(company4);
	            ref.add(company3);
	            ref.add(company2);
	            ref.add(company1);
	            
	            
	            for(String element:ref) {
	            	
	            	System.out.println(element);
	            	
	            	
	            }
	            
	            Iterator<String> itr = ref.iterator();
	            
	            while(itr.hasNext()) {
	            	
	            	System.out.println(itr.next());
	            }
	            
	            
	            
	            	
				}
	
	
	
	
	
	
	
	
}
