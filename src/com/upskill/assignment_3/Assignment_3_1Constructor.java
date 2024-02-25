package com.upskill.assignment_3;

public class Assignment_3_1Constructor {
	/* Problem 01.	Write a class name BankAccount which has savings and checking class.     
	 * BankAccount class that has a name and an initial amount, which are both set in the constructor. 
	 * Also, it lets users make deposits. Note that the account name must be set when an account is created. 
	 * Demonstrates the account class hierarchy with output of:
																a.	account name: savings
																b.	initial amount: 10000
																c.	new amount after deposit: 15000
																d.	account name: checking
																e.	initial amount: 20000
																f.	new amount after deposit: 26000
																g.	new amount after withdrawal: 23000                 
																   */
	
	String accountName;
	float initialamount;
	
	public Assignment_3_1Constructor(String name, float amount) {
		accountName=name;
		initialamount=amount;

	}
	public Assignment_3_1Constructor(String name) {
		accountName=name;
	}
	public Assignment_3_1Constructor(float amount) {
		initialamount=amount;
	}
	
	
	public static  void main(String[] args){
		Assignment_3_1Constructor obj  = new Assignment_3_1Constructor("Savings", 10000);
		System.out.println(obj.accountName);
		System.out.println(obj.initialamount);
			
	}
	
}
	
