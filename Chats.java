package com.xworkz.access;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Chats {

                 public static void main(String[] args) {
					
                	String chat1 = "masalapuri";
                	String chat2 = "panipuri";
                	String chat3 = "Sevpuri";
                	String chat4 = "dahipuri";
                	
                	Collection<String> ref = new LinkedList();
                	ref.add(chat4);
                	ref.add(chat3);            //it allow the duplicates
                	ref.add(chat2);            // there is insertion
                	ref.add(chat1);
                	ref.add(chat4);
                	ref.add("samosa");
                	ref.add(null);
                	System.out.println(ref.size());
                	
                	System.out.println(ref);
                	
                	Collection<String> ref2 = new HashSet(); //it doesn't allow the duplicates
                	ref2.add(chat4);                           //there is no order with respect tohashset
                	ref2.add(chat3);
                	ref2.add(chat2);
                	ref2.add(chat1);
                	ref2.add(chat4);
                	ref2.add("samosa");
                	ref2.add(null);
                	System.out.println(ref2.size());
                	
                	System.out.println(ref2);
                	
                	
                	
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
				}















}
