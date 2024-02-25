package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		int[] ageFalcon = new int[] {25,30,28,35,40};    // Array
		//Array index [0] [1] [2] [3] [4]
		System.out.println("Student Age: "+ageFalcon[3]);
		System.out.println("Total Student: "+ageFalcon.length);
	
		
		//Write an array for Student name?
		    String[] nameFalcon = new String[]{"Tahmid", "Lubna", "Salman", "Rumi","Sumaiya"};	
		    System.out.println("Student Name: " +nameFalcon[3]);
			System.out.println("Total Student: " +nameFalcon.length);
			 
			boolean[] attendenceFalcon = new boolean[]{ true, false, false, true, true};
			System.out.println("Student Attendence: " +attendenceFalcon[3]);
			System.out.println("Total Student: " +attendenceFalcon.length);
			
			// Multi-Dimentional Array
			int[][] ageFalcon2D = {{25, 30 , 28, 35, 40},      // [0][0]  [0][1] [0][2] [0][3] [0][4]
					{24, 28, 32, 22}};                         // [1][0]  [1][1] [1][2] [1][3] [1][4]
			            System.out.println("Student Age 2D : " +ageFalcon2D[0][3]);
			           //
			            String[][] nameFalcon2D = {{ "Tahmid", "Salman"},   // [0][0] [0][1]
			            		{"Lubna", "Tamanna"}};                      // [1][0] [1][1]
			            System.out.println("Student Name 2D: " +nameFalcon2D[1][1]);
			            
			            // Hashmap store multipul data using key-value pan, implementation of Map interface
			            HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
			            
			            StudentAge.put("Tahmid", 25);
			            StudentAge.put("Lubna", 24);
			            StudentAge.put("Salman", 27);
			            StudentAge.put("Rumi", 35);
			            StudentAge.put("Tahmid", 25);
			            
			            System.out.println("Hashmap Student Age :" + StudentAge.get("Lubna"));
			            //
			            HashMap<String, Boolean> StudentAttendance = new HashMap<String, Boolean>();
			           StudentAttendance.put("Tahmid", true);
			           StudentAttendance.put("Salman", false);
					    
			           System.out.println("Hashmap Student Attendance:" + StudentAttendance.get("Tahmid"));
						
						System.out.println("Student Attendence: " +attendenceFalcon[3]);
						System.out.println("Total Student: " +attendenceFalcon.length);
			            
                  // Hashmap store multipul data using key-value pan, implementation of Map interface			            
                       HashMap<String, String> CountryCity= new HashMap<String, String>();
			            
			     CountryCity.put("Bangladesh","Dhaka");
			     CountryCity.put("USA","NewYork");
			            
			            
		             System.out.println("Hashmap Country City :" + CountryCity.get("USA")); 
		             // Hash Table store multiple data using key-value pair, No duplicate,
		             // also is synchronized (only one thread can be modified)
		             Hashtable<String, String> Region= new Hashtable<String, String>();
		             Region.put("BD", "Asia");
		             Region.put("USA", "America");
		             
		             
		             
		             System.out.println("Hashtable Region :" + Region.get("BD")); 
		             // Hashset Store unordered collection containing unique value, Implementation of Set interface
		             HashSet<String> car = new HashSet<>();
		             car.add("BMW");
		             car.add("Tesla");
		             car.add("Audi");
		             car.add("Ford"); 
		             System.out.println("Car :" +car);
		             //
		              HashSet<Integer> student_Id = new HashSet<>();
		              student_Id.add (5690);
		              student_Id.add (5694);
		              System.out.println("Studnet_Id :" +student_Id);
			}
	
	}



