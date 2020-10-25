package com.syntax.class11;

public class GroupTask2 {
	public static void main(String[] args) {
	
	//Write a java program to find the second largest number in the array?
	
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
