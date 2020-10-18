package com.syntax.class08;

public class ForLoopDemo {
public static void main(String[] args) {
	//task: I want to say good morning 5 times
	
	
		
	for(int i=5; i<10; i++) {//first we initialize (i=1;), then we check condition (i<=5;)
		System.out.println("Good Morning");//last we increment (i++), then we check condition again
	}
//for loop is used when you know how many loops are needed
	
	
	///task 2: Print number 1 to 100 using for loop:
	
	for(int a=1;a<=100; a++) {
		System.out.println(a);
	}

	//task 3: print numbers from 10 to 0
	
	for(int b=10; b>0; b--) {
		System.out.println(b);
	}
}

}
