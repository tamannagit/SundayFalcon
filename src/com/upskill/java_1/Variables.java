package com.upskill.java_1;

public class Variables {
	
	
	
	
	
	
	
	
	    String country = "USA";
	    static String region = "America";

	public static void main(String[] args) {
		
		 String city = "New York";
		 System.out.println(city);
		 Variables object = new Variables();
		 System.out.println(object.country);
		 System.out.println(region);
		 
		 object.CT("Danbary");		
	}
	
	public void NJ(){
		String city = "Paterson";
		System.out.println(city);
		Variables object = new Variables();
		System.out.println(object.country);
		System.out.println(region);
			
	}
	
	public void CT(String county){
		String myCounty = county;
		System.out.println(myCounty);

		
		
		
		String city = "Hartfort";
		System.out.println(city);
		Variables object = new Variables();
		System.out.println(object.country);
			
	}

}
