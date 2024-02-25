package com.upskill.java_6;

public class MultiThreading extends Thread{
	public static void main(String[]args){
		int n= 4;
		for (int i = 0; i<n; i++)
		MultiThreadingThread obj = new MultiThreadingThread();
		obj.start();
	}
}
