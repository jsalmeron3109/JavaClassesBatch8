package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {
	
public static void main(String[] args) {
	//define whether number entered from user: small num btw 1-10
	//med num btw 11-100, large num btw 101-1000
	
	Scanner input;
	int number;
	input=new Scanner(System.in);
	System.out.println("Please enter any number");
	number=input.nextInt();
	if(number>0 && number<=10) {//to test multiple conditions use logical operator && (AND)
		System.out.println("You entered small number");
	}else if (number>10 && number<=100) {
		System.out.println("You entered medium number");
	}else if (number>100 && number<=1000) {
		System.out.println("You entered large number");
	}
	
	
	
}
}
