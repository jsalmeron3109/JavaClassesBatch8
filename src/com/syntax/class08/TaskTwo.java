package com.syntax.class08;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		//Tast1: write program that reads range (start and end point) provided by user
		//from that range print sum of even and odd integers
		System.out.println("Please enter starting point number");
		int start=scan.nextInt();
		
		System.out.println("Please enter ending point number");
		int end=scan.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd=sumOdd+i;
			}
			
			System.out.println("sum of even range: "+sumEven);
			System.out.println("sum of odd range: "+sumOdd);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//ask user to enter item they want to buy and price of item
		//tell user how much is left to pay item after each time user enters money
		//if user gives more money program should return a change
		//when user is done with payments say "Thank you for shopping!"
		
		
	}

}
