package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		//capture a sentence
		String sentence=scanner.nextLine();
		
		System.out.println("You entered sentence: "+sentence);
		
		//capture a number
		int num=scanner.nextInt();
		System.out.println("You entered number: "+num);
		
		//capture 1 character
		char a=scanner.next().charAt(0);
		System.out.println("You entered character: "+a);

	}

}
