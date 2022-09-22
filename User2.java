class User2{

           static String cards[] = {"Platinum credit card","Debitcard","creditcard","Mastercard","Kotak urban card"};
		   
		   static String bankname[] = {"Bank of baroda","Union bank","SBI bank","HDFC bank","Kotak bank"};
		   
		   static String users[] = {"Ravi","santhosh","kumar","kavya","Rani"};
		   
		   static int[] accno = {1203,20,30,40,50};
		   
		   static long[] contactNo = {9876698568L,9847837897L,6764768886L,7548774298L,6573687947L};
		   
		   public static void main(String arg[]){
		   
		   
		     System.out.println("\nlist of the credit card");
		   
		    for(int c=0;c<=cards.length -1 ; c++){
			
			
			System.out.println(cards[c]+ " ");
			
			}
		   
		   System.out.println("\nlist of the banksname");
		   
		   for(int b=0;b<bankname.length;b++){
			   
			System.out.println(bankname[b]);  
			   
	       }
		   
		   System.out.println("\nlist of users");
		   
		   for(int u=0;u<users.length;u++){
			   
			   System.out.println(users[u]);
		   
		   }
		   
		   System.out.println("\nlist of accounts");
		   
		   for(int a=0;a<accno.length;a++){
			   
			   System.out.println(accno[a]);
		   }
		   
		   System.out.println("\nlist of contactno");
		   
		   for(int z=0;z<contactNo.length;z++){
			   
			   
			   System.out.println(contactNo[z]);
			   
			   
			   
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   }













}