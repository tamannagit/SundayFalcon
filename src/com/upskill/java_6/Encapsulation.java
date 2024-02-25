package com.upskill.java_6;

public class Encapsulation {
public static void main(String[] args){
	Encapsulation obj = new Encapsulation();
	System.out.println(obj.getName());
	obj.setName("Tahmid");
	System.out.println(obj.getName());
	obj.setssn(999999);
	System.out.println(obj.getusername());
	obj.setpassword("upskill999");
}
	
		private String name = "Tamanna";                      // Read and Write 
		private int mobileNumber = 8989009;                   // Retrieve, read only
		private int ssn = 7889079;                           // update, write only
		private String username = "Upskill";                // Retrieve, read only
		private String password = "Upskill123";            // Update, write only
		// setter Method - name                // set the data, write
		public void setName(String value){
			name = value;
	}
		// Getter Method - name                // get the data, read
		public String getName(){
			return name;
		
		}

		// Getter Method - mobileNumber       // get the data, read
		public int getmobileNumber(){
			return mobileNumber;
		}
		// setter Method - ssn          // set the data, write
				public void setssn(int value){
					ssn = value;
				}
	   // Getter Method - user name
				public String getusername(){
				return username;
}
				// Setter Method - password
				public void setpassword(String value){
					password = value;
				}
}
		


