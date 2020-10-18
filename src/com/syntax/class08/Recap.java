package com.syntax.class08;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	//ask user to pay for water
	//price is $5, once user enters money they have 
	//based on what they give, tell user if they need more or less money
	//once user gives exact $5, tell user to enjoy their water
	
	Scanner scan = new Scanner(System.in);
	int money;
	int price=5;
	
	System.out.println("Please pay for water");
	money=scan.nextInt();
	
	while(money!=price) {
		if(money>price) {
			System.out.println("You gave too much, you need to give less money");
		}else {
			System.out.println("Water is expensive, please give more");	
		}
		money=scan.nextInt();
	}
	System.out.println("Enjoy your water!");//if value entered=price, while statement will be ignored^
}
}
