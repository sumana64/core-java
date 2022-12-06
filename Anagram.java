class Anagram{

             public static void main(String args[]){
			  
			  String s1 = "silent";
			  String s2 = "listen";
			 
			  char c1[] = s1.toCharArray();
			  char c2[] = s2.toCharArray();
			  
			  if(c1.length!= c2.length){
			  
			  System.out.println("not Anagram");
			 
			  }
			 
           	  Arrays.sort(c1);
			  Arrays.sort(c2);
			  
			  for(int i=0;i<c1.length;i++){
			  
			  if(c1!=c2){
			  
			    System.out.println("not Anagram");
			  }
			  
			  }
			  System.out.println(s1);
			  System.out.println(s2);

			  System.out.println("Anagram");
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 }











}