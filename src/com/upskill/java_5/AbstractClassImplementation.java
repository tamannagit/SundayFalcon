package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
	int door = 4;
	}

	@Override
	public int iWheel() {
		int wheel = 4;
		return wheel;
	}

	@Override
	public String iEngine() {
		String engine = "1000hp";
		return engine;
	}

}

/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)	
					
Class					  extends				 class
Abstract Class (+3)  	  extends                class(3-3=0)
Interface(+3) 			  implements             class(3-3=0)
Interface(+3) 			  extends                interface(+3+3=6)       implements              class (6-6=0)

*/
