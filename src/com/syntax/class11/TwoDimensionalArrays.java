package com.syntax.class11;

public class TwoDimensionalArrays {
public static void main(String[] args) {
	//                   [rows][columns]
	char [][]array=new char [3][4]; //3 rows, 4 columns
	//add values to first row
	array[0][0]='A';
	array[0][1]='B';
	array[0][2]='C';
	array[0][3]='D';
	
	//add values for second row
	array[1][0]='W';
	array[1][1]='X';
	array[1][2]='Y';
	array[1][3]='Z';
	
	//ad values for 3rd row
	array[2][0]='Q';
	array[2][1]='W';
	array[2][2]='B';
	array[2][3]='R';
	
	//print the value Z
	System.out.println(array[1][3]);
}
}
