package com.syntax.class06;

import java.util.Scanner;

public class ReviewNestedIf {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//ask user to enter password, if password is correct ask user to check account balance
		//
		
		String pass;
		double accountBalance=1000;
		double transferAmount=500;
		System.out.println("Welcome, please enter your password");
		pass=scan.nextLine();
		
		if ("pass123".equals(pass)) {
			System.out.println("Please enter the amount that you want to transfer");
			transferAmount=scan.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Insufficient funds to complete your transfer");
			}else {
				System.out.println("Remaining balance after transfer "+(accountBalance-transferAmount));
			}
		}else {
			System.out.println("Please enter correct password.");
		}
	}

}
