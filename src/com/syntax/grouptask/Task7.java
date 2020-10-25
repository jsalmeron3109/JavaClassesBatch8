package com.syntax.grouptask;

public class Task7 {
	public static void main(String[] args) {
		//Create a 2D array to store numbers in 3 rows and 4 columns.
		//Develop a program which will identify/print the even numbers only.
				int[][] array = {
						{12,16,55,77},
						{24,1,66,78},
						{11,33,44,55,6},
				};
				
				
					int total = 0;	
					
				for (int i=0; i<array.length;i++) {
					for (int j=0; j<array[i].length;j++) {
						if (array[i][j]%2==0) {
				System.out.print(array[i][j]+" ");
						}
						}
	}
	}
}
