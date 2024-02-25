package com.upskill.java_1;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add1(7,3);
		add1(3,4);
		add1(20,39);
		boolean r = add2();
	

	}
	public static void add(){
		int a=2;
		int b =3;
		int c =a+b;
		System.out.println(c);
	}
	public static void add1(int a, int b){
		boolean c= a>b;
		System.out.println(c);
	}
	public static boolean add2() {
		
		MethodExample obj = new MethodExample();
		int a = 10;
		int b = 20;
		boolean c = a<b; 
		System.out.println(c);
	    return c;
	}

}
