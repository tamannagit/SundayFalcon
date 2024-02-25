package com.upskill.java_1;

public class MethodType extends Variables{
	
	
	
	public static int hourlyIncome=65;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());

		weeklyIncomeStatic();
	}
	
	// void Method
	public void annualIncomeVoid(){
		int calcualteAnnualIncome =hourlyIncome*2000;
		System.out.println("My Annual Income= " + calcualteAnnualIncome );
		
	}
	
	// return type Method
	public int monthlyIncomeReturn(){
		int calcualteMonthlyIncome = hourlyIncome*200;
		return calcualteMonthlyIncome;
	}
   // static Method
    public static void weeklyIncomeStatic(){
    	int calcualteWeeklyIncome = hourlyIncome*40;
    	System.out.println("My Weekly Income = "+ calcualteWeeklyIncome);
    }
	
}
