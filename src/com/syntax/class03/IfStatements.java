package com.syntax.class03;

public class IfStatements {
	public static void main(String[] args) {
		
		int num1=1800;
		int num2=900;
		
		//writing if statement:
		if(num1>num2) {//if condition is true then you will be able to execute your code
			System.out.println("num1 is bigger than num2");//num1 is bigger than num2 will show in console bc its true
		
			//control flow: 
			   //if statement
			      //syntax for if statement: if (boolean expression) { code...}
			
		}
		
		int temp=70;
		if (temp>80) {
			System.out.println("I am going to the beach");//response does not print in console since condition is false
		}else {
		System.out.println("I will go for a walk");//I will go for a walk will be printed
		//whenever condition is false statement will automatically print else statement only
		
	}
		
		double expectedHours=20;
		double actualHours=8;
		
		if(actualHours>expectedHours) {//true
			System.out.println("You will succeed the course and get a job.");
		}else{//false
				System.out.println("Course will be too hard.");//else syntax will print since 8 is not greater than 20.
			}
		}
	}

