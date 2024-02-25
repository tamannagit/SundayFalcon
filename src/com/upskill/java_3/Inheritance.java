package com.upskill.java_3;
import com.upskill.java_1.MethodType;


public class Inheritance extends MethodType {
	//Child class / parent class

	public static void main(String[] args) {
		
		
		Inheritance obj = new Inheritance();
		
		obj.annualIncomeVoid();
		MethodType.weeklyIncomeStatic();
		
        obj.CT("essex");
        obj.NJ();
	}

}
