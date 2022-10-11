class DistrictTester{

            public static void main(String a[]){
			
			District dict = new District();
			dict.name = "Bengaluru rural";
			dict.headQuarter = "Bengaluru";
			dict.population = 990923;
			dict.area = "430 km";
			dict.facilities();
			System.out.println(dict.name + " " + dict.headQuarter + " " + dict.population + " " + dict.area);
			
			District dict1 = new District();
			dict1.name = "Tumakuru";
			dict1.headQuarter = "Tumkuru";
			dict1.population = 2678980;
			dict1.area = "10597 km";
			dict1.facilities();
			System.out.println(dict1.name + " " + dict1.headQuarter + " " + dict1.population + " " + dict1.area);
			
			District dict2 = new District();
			dict2.name = "Ramanagara";
			dict2.headQuarter = "Ramanagara";
			dict2.population = 1082636;
			dict2.area = "3516 km";
			dict2.facilities();
			System.out.println(dict2.name + " " + dict2.headQuarter + " " + dict2.population + " " + dict2.area);
			
			District dict3 = new District();
			dict3.name = "Uttara Kannada";
			dict3.headQuarter = "Karwar";
			dict3.population = 1437169;
			dict3.area = "10291 km";
			dict3.facilities();
			System.out.println(dict3.name + " " + dict3.headQuarter + " " + dict3.population + " " + dict3.area);
			
			District dict4 = new District();
			dict4.name = "Dakshina kannada";
			dict4.headQuarter = "Mangalore";
			dict4.population = 2089649;
			dict4.area = "4,559 km";
			dict4.facilities();
			System.out.println(dict4.name + " " + dict4.headQuarter + " " + dict4.population + " " + dict4.area);
			
			}















}