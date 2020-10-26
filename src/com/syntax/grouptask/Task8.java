package com.syntax.grouptask;

public class Task8 {
public static void main(String[] args) {
	
	int[][] a = { {0,3, -1, 3 }, { 4, 8, 2 } };
	System.out.println(a.length);
	System.out.println("==================");
	int sum = 0;
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if (a[i][j] % 2 != 0) {
				sum += a[i][j];
			}
		}
	}
	System.out.print("The total of odd numbers in this array is "+sum);
}
}
