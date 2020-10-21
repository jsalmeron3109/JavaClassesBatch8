package com.syntax.class08;

public class BreakAndContinue {
public static void main(String[] args) {
	//break ->stops loop
	
	for (int i=1;i<4;i++) {
		System.out.println("Hello");
		break;//prints hello only 1 time because it stops the code from looping again
	}
	//print numbers from 1 to 10, break loop at number 5
	int a;
	for(a=1;a<=10;a++) {
		if(a==5) {
			break;//1,2, 3, 4 will print and loop will not print anything else
	}
	
	System.out.println(a);
}
}
}
