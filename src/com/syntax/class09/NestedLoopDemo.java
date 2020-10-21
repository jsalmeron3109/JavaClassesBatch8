package com.syntax.class09;

public class NestedLoopDemo {
	public static void main(String[] args) {
		for(int i=0; i<2; i++) {//outer loop
			System.out.println("Hello");
			for(int y=0; y<3; y++) {//inner loop
				System.out.println("Bye");
			}
			//inner loop will only be executed if the outer loop is true
		}
		
		//// more examples:
		
		for (int i=10; i<=14; i++) {
			System.out.println(i);
			for(int j=1;j<=4; j++) {
				System.out.println(j);
			}
		}
		
		for(int a=10; a<=14; a++) {
			for(int b=1; b<=4; b++) {
				System.out.println("a="+a+" & "+"b="+b);
			}
		}
		//print numbers 10-99 using nested loop:
		
		for(int i=1; i<=9; i++) {//<1-9 first digit
			for(int j=0; j<=9; j++) {//<0-9 second digit
				System.out.println(i+""+j);//<add 1st and 2nd digit to get result
			}
		}
	}

}
