package com.syntax.class04;

import java.util.Scanner;
//shortcut to import command,shift,o
public class ScannerClass {
public static void main(String[] args) {
	
	int num=80;
	String str="I am String";
	Scanner scan=new Scanner(System.in);//enables input to console
	String value=scan.nextLine();//line waits for our input, 
	//once input is provided in console hit enter
	
	
	System.out.println("I captured value= "+value);
	
	System.out.println("Please enter your name");
	String name=scan.nextLine();
	System.out.println("Nice to meet you "+name);
	
	System.out.println("Please Enter First Name");
	
	
	
}
}
