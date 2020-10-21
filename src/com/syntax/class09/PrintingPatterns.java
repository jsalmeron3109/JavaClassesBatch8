package com.syntax.class09;

public class PrintingPatterns {
	public static void main(String[] args) {
		//number of rows controlled by outer loop
		//number of columns controlled by inner loop
		//create 4 rows of ******
		
		for (int r=1; r<=4; r++) {
			  for (int c=1; c<=6; c++) {
			   System.out.print("*");//use print() instead of println()
			  }
			  System.out.println();
			}
		//next example: print 4 columns of 12345
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
			}
		
		for(int a=7; a>=1;a--) {
			for(int b=0; b<=7; b++)
				System.out.print(a);
			System.out.println();
		}
		
		}
	}

