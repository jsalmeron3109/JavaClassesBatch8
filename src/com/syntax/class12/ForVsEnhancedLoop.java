package com.syntax.class12;

public class ForVsEnhancedLoop {

	public static void main(String[] args) {
		
		int []num= {10, 20, 30, 1};//num.length =4 b.c 4 elements in array

		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
	}

}
