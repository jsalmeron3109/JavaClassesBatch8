package com.syntax.class04;

public class TaskOne {
	public static void main(String[] args) {
		/*Create a Java program and declare int variable that will hold a month. 
		 * Based on the value of the variable your program should print 
		 * the name of the month.
		   Write a program to check whether number is positive or negative.
		   Write a Java Program to check whether number is Even or Odd.
		 */
	int month=12;
	if(month==12) {
		System.out.println("It is December");
	}
	
	byte num1=-7;
	if(num1<0) {
	System.out.println(num1+" is a negative number");
	}else {
		System.out.println(num1+" is a positive number");
	}
	
	int num2=25;
	if(num2%2==0) {
		System.out.println(num2+" is an even number");
	}else {
	System.out.println(num2+" is an odd number");
}
}
}
