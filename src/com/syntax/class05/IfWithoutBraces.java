package com.syntax.class05;

public class IfWithoutBraces {
public static void main(String[] args) {
	
	boolean isSaturday=false;
	
	if(isSaturday) //if you don't have braces in if statement
		System.out.println("Today is a Java class");//this will be the only line printed in if  
		System.out.println("And tomorrow I will have a Java class");
	
	//only one line statement is okay in if statement without braces
	System.out.println("I am a code outside of if statement");
	
}
	
}
