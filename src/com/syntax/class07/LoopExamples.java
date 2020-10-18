package com.syntax.class07;

import java.util.Scanner;

public class LoopExamples {
public static void main(String[] args) {
	/// do while example: play a lottery where we need to enter number range from 1-10
		//lucky number is 7
		//keep asking user top enter number until they enter lucky number
	
		Scanner scan= new Scanner(System.in);
		int num;
		int luckyNumber=7;
		
		do {
			System.out.println("Please enter any number between 1 and 10");
			num=scan.nextInt();
		}while(num!=luckyNumber);//this will continue loop until user enters the lucky number
			System.out.println("You guessed the right number");
		
			
			/// while loop version: ///
			
			
			//num=scan.nextInt();
			// while(num!=luckyNumber){
			//num=scan.nextInt();
			// System.out.println("Please enter any number from 1 to 10");}
}
}
