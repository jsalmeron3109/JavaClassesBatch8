package com.syntax.class08;

public class TaskOne {
public static void main(String[] args) {
	//calculate sum of even and add numbers from 1-50
	int even=0;
	int odd=0;
	
	for (int num=1; num<=50; num++) {
		if(num%2==0) {
			 even=even+num;
		}else {
			 odd=odd+num;
		}
	}
	System.out.println(even);
	System.out.println(odd);
	//create multiplication table
	//1x1..1x2..1x3 to 1x10=10
	
	int num1=1;
	int result;
	for(int num2=1;num2<=10; num2++) {
		result=num1*num2;
		System.out.println(num1+"x"+num2+"="+result);
		
	}
	
	
	
}
}
