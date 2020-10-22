package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {
public static void main(String[] args) {
	//ask user how many names they'd like to store
	//then store names
	
	Scanner scan;
	String[]names;
	int size; /// user determine size of array
	
	scan= new Scanner(System.in);
	System.out.println("How many names would you like to store?");
	size=scan.nextInt();
	
	names = new String[size];
	

	for(int i=0;i<size; i++) {//we are storing values into an array
		System.out.println("Please enter any name");
		names[i]=scan.next();
	}
	
	for(int i=0; i<names.length; i++) {//we are retrieving values from array
		System.out.print(names[i]+" ");
	}
	
}
}
