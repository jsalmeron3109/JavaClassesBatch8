package com.syntax.grouptask;

public class Task5 {
	public static void main(String[] args) {
		
		int array[]= {300, 300, 299, 300, -5, -3};
		int largest=array[0];
		int secondLargest=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}else if(array[i]>secondLargest&&array[i]!=largest) {
				secondLargest=array[i];
			}
					
				}

		
			System.out.println(secondLargest);
			
		
	}

}
