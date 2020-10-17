package com.syntax.class05;

import java.util.Scanner;

public class Task3Improved {

		public static void main(String[] args) {
			//3 inputs -> quiz, midterm, final scores
			//determine grade basedon:
			//average score>=90 = A
			//average score >=70 and <=90 = B
			//average score >=50 and <70 = C
			//average score <50 = F	
	        Scanner scan;
	        int quiz, mid, finalScore, avg;
	        
	        scan = new Scanner(System.in);
	        
	        System.out.println("Please enter your quiz score");
	        quiz = scan.nextInt();
	        
	        System.out.println("Please enter your mid term score");
	        mid = scan.nextInt();
	        
	        System.out.println("Please enter your final score");
	        finalScore = scan.nextInt();
	        
	        avg = (quiz + mid + finalScore)/3;
	        System.out.println(avg);
	        
	        char grade;
	        
	        if(avg>=90) {//cleaner way to code
	            grade='A';
	        }else if(avg>=70 && avg<90) {
	            grade='B';
	        }else if (avg>=50 && avg <70) {
	            grade='C';
	        }else {
	            grade='F';
	        }
	        System.out.println("Your grade is: "+grade);
	        
	        if(grade=='A' || grade =='B') {
	            System.out.println("You are a good student");
	        }else {
	            System.out.println("Please study more");
	        }
	    }
	}
	


