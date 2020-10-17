package com.syntax.class06;

import java.util.Scanner;

public class ReviewSwitch {
public static void main(String[] args) {
	//using scanner, create a calculator
	//user enter 2 numbers and an operator
	//based on operator prove result to user
	Scanner scan= new Scanner(System.in);
	int num1;
	int num2;
	char operator;
	int results=0;
	System.out.println("Please enter two numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println("Please enter the operation +,-,/,*");
	operator=scan.next().charAt(0);
//	 
//	if(operator=='+') {
//		results=num1+num2;
//	}else if(operator=='-'){
//		results=num1-num2;
//	}else if(operator=='*') {
//		results=num1*num2;
//	}else if(operator=='/') {
//		results=num1/num2;
//	}else {
//		System.out.println("You entered an invalid operator");
//	}
//
//	System.out.println(results);
	  //*SHOW HOW TO DO ABOVE CODE IN SWITCH FORMAT*
	
	switch(operator) {
	case '+':
		results=num1+num2;
		break;
	case '-':
		results=num1-num2;
		break;
	case '*':
		results=num1*num2;
		break;
	case '/':
		results=num1/num2;
		break;
	default:
		System.out.println("Invalid operator entered");
		break;
	}
	
	System.out.println(results);
}
}
