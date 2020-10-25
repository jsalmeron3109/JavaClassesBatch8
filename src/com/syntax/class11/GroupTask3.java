package com.syntax.class11;

public class GroupTask3 {
	public static void main(String[] args) {
	

	//Write a Java Program to print the first 10 numbers of Fibonacci series.
	
			int count=10, num1=0, num2=1;
			for(int i=1; i<=count;i++) {
				int sum=num1+num2;
				System.out.print(num1+" ");
				num1=num2;
				num2=sum;
		
			}
	}
}

