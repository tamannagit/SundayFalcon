package com.upskill.java_2;

public class Loops {
	 /* Types of loops 
	   1. For Loop
	   2. while Loop
	   3. Do while Loop
	   4. Infinite people
	 */

	public static void main(String[] args) {
//          practiceForLoop();
         // practiceWhileLoop();
         // practiceDoDWhileLoop();
         // practiceInfiniteLoop();
          practiceNestedForLoop();

	}
	// For loop
	 public static void practiceForLoop(){            // For Loop - Do again and again upto upper limit
		                                              // Initialize the variable
		                                              // Setting lower limit, increment or Decrement
		                                              // Statement
		 int i;
		 for (i = 1; i<=20; i++){
			 System.out.println("For Loops number=" +i);
		 }
	 }
	 // While loop                                            // While loop- Do again and again upto condition match
	 public static void practiceWhileLoop(){                 // Initialize the variable  
		                                                     // Setting condition
		 int i = 2;                                         // statement
		 while(i<=10){                                      // Increment or decrement
			 System.out.println("While Loops number=" +i);  
			 i++;
		 }
	 }
	 // Do While Loop                                               // Do While loop - Do action then match condition
	 public static void practiceDoDWhileLoop(){                    // Initialize the variable
		 int i = 1;
		 do {
			 System.out.println("Do While Loops number=" +i);      // Statement
			 i++;                                                  // Increment or decrement
		 } while (i<=10);                                          // checking condition
		 
	 }
	 // Infinite Loop
	 public static void practiceInfiniteLoop(){
		 int i;
		 for (i=1; ; i++){
			 System.out.println("For Loops number="+i);
		 }
		 
	 }
	 
     // Nested Loop
	 
	 public static void practiceNestedForLoop(){            
             int i;
             int j;
             for (i = 1; i<=10; i++){
            	 for (j = 1; j<=10; j++){
            		 int multipicationTable = i * j;
            		 System.out.print(multipicationTable +" ");
            	 }
             
               System.out.println(" ");
	 }
  }
}

