package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {
public static void main(String[] args) {
	
	String day="Saturday";
	//"||" = OR
	if(day.equals("Saturday") || day.equals("Sunday")) {//one or both conditions must be true to print
		System.out.println("Today I have a Java class at Syntax");
	}
	/////////////////////////next example:
	//if day is 1 or 5, I am off from Syntax
	//if day is 2 or 3, Git class
	//id day is 4, review class
	//if day is 6 or 7, Java class
	//anything else is invalid day
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter todays day unsing numbers only");
	int today=scan.nextInt();
	
	if(today==1 || today==5) {
		System.out.println("I am off from Syntax");
	}else if(today==2 || today==3) {
		System.out.println("Today is Git class");
	}else if(today==4) {
		System.out.println("Today is review class");
	}else if(today==6 || today==7) {
		System.out.println("Today is Java class");
	}else {
		System.out.println("Please enter a valid day from 1 to 7");
	}
		
	
  }
}
