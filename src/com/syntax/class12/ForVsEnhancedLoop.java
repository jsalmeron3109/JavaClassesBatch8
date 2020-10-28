package com.syntax.class12;

public class ForVsEnhancedLoop {

	public static void main(String[] args) {
		
		//print numbers in array from last to first element:
		
		int []num= {10, 20, 30, 1};//num.length =4 b.c 4 elements in array

		for(int i=num.length-1;i>=0;i--) {//num.length-1 lets loop 
			System.out.println(num[i]);
		}
		//we cannot loop backwards using enhanced for loop
		//it starts from beginning of your loop and stops at the end
		
	}

}
