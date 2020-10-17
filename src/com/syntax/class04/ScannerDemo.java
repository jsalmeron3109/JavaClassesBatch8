package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//I would like to take input from console
		//need a scanner to do this v
		
		Scanner input=new Scanner(System.in);//add import, cmmd+shift+o
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();//allows you to enter boolean value in console
		
		if(rain) {
			System.out.println("Take an umbrella with you");
		}else {
			System.out.println("It is a nice day for a walk");
		}
		System.out.println("Please enter your age");
		int age=input.nextInt();
	System.out.println(age);
	System.out.println("Please enter your name");
	String name=input.next();
	System.out.println(name);
	
	System.out.println("Your name is "+name+" you are "+age+" years old");
		
	}

}
