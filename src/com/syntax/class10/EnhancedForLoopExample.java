package com.syntax.class10;

public class EnhancedForLoopExample {
public static void main(String[] args) {
	
	
	int[]numbers= {10,20,30,40,50};
	for(int num:numbers) {
		System.out.println(num);
	}
	
	//example using boolean
	boolean[] arrayOfBoolean= {true, true, false, true};
	
	for(boolean elements:arrayOfBoolean) {
		System.out.println(elements);
	}
	
}
}
