package com.syntax.class05;

	import java.util.Scanner;

	public class Task1 {
		public static void main(String[] args) {
			Scanner scan;
			String answer;
			double balance;

			scan = new Scanner(System.in);
			System.out.println("Do you have a credit card?(T/F)");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("What is the balance?");
				balance = scan.nextDouble();
				if (balance > 1000) {
					System.out.println("Please pay off balance");
				} else {
					System.out.println("You can spend more $$");
				}

			} else {
				System.out.println("Would you like to apply for a credit card?");
			}

		}

	}

