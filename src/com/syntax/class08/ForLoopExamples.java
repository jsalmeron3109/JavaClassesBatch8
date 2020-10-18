package com.syntax.class08;

public class ForLoopExamples {
	public static void main(String[] args) {
		//print even numbers 20 to 1
		
		for(int a=20; a>1;a--) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		
		//print odd numbers between 20 and 50:
		for(int b=20; b<50;b++) {
			if(b%2==1) {
				System.out.println(b);
			}
		}
	}

}
