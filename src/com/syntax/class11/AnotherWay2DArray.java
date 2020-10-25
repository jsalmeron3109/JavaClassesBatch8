package com.syntax.class11;

public class AnotherWay2DArray {
public static void main(String[] args) {
	int[][] array= {
			{10,20,30},
			{1,2,3},
			{100,200,300} };
			
		System.out.println(array[2][1]);//200
		System.out.println(array[0][0]);//10
		System.out.println(array.length);//size of array =3 b.c there are 3 rows
		
		//how to retrieve all values from array
		for (int row=0;row<array.length; row++) {//loops through rows
			for(int column=0;column<array[row].length;column++) {
				System.out.print(array[row][column]+" ");
			}
			System.out.println();
		}
			
		
		
	}
}

