class Swiggy2Tester{


            public static void main(String a[]){
			//invoking the method with ref
			
			Swiggy2.takeOrder("pizza");
			double ref = Swiggy2.takeOrder("pizza");
			System.out.println("the final order is arrived.." + ref);
			
			
			
			
			
			}









}