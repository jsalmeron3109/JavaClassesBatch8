package com.syntax.grouptask;

public class Task6 {
	public static void main(String[] args) {
		//Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.
			int count=0;
		int [][] arr ={
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		for (int r=0;r<arr.length;r++) {
			 for (int c=0; c<arr[r].length;c++) {
				 count +=arr[r][c];
			 }
		}
		System.out.println(count);
	}

}
