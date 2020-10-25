package com.syntax.grouptask;

public class Task5 {
	public static void main(String[] args) {
		
		int array[]= {10, 300, 299, 4, -5, 0};
		int largest=array[0];
		int secondLargest=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}else if(array[i]>secondLargest) {
				secondLargest=array[i];
			}
					
				}

		
			System.out.println(secondLargest);
			
		
	}

}
