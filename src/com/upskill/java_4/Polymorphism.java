package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	/* Polyymorphism is the ability of an object to take on many forms
	  - Method 
	 */


	public static void main(String[] args) {
	car(4,4);
	Polymorphism obj = new Polymorphism();
	obj.annualIncomeVoid();
	}
	
	
	
	public static void car(){
		System.out.println("My car is Tesla");
		
	}
	public static void car(int door){
		System.out.println("My car is Tesla ! , it has door :" + door);
	}
	public static void car(String color){
		System.out.println("My car is Tesla !, it has color:"+color);
	}
	public static void car(Boolean dualMotor) {
		System.out.println("My car is Tesla !,it has dualMotor:"+dualMotor);
	}	
	public static void car(int seat, String bodyType) {
		System.out.println("My car is Tesla !,it has seat :"+seat + "it has bodyType :" + bodyType);
	}
	public static void car(int door, int wheel) {
		System.out.println("My car is Tesla !,it has door :"+door + "it has wheel :" + wheel);
	}	
}

	
