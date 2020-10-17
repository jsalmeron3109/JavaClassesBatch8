package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		//3 inputs -> quiz, midterm, final scores
		//determine grade basedon:
		//average score>=90 = A
		//average score >=70 and <=90 = B
		//average score >=50 and <70 = C
		//average score <50 = F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quiz score");
		int quiz=scan.nextInt();
		System.out.println("Enter midterm score");
		int  midterm=scan.nextInt();
		System.out.println("Enter final score");
		int finalScore=scan.nextInt();
		 int average=(quiz+midterm+finalScore)/3;
		
				if(average>=90) {
					System.out.println("You got an A");
				}else if(average>=70 && average<=90) {
					System.out.println("You got a B");
				}else if(average>=50 && average<=70) {
					System.out.println("You got a C");
				}else if(average<50) {
					System.out.println("Your got an F");
				}
		
	}

}
