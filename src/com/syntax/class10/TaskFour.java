package com.syntax.class10;

public class TaskFour {
public static void main(String[] args) {
	//Create an array of cars and store 6 elements into it. Print all values from the array.
	
	String[] cars= {"Toyota", "Honda","BMW","Audi","Lexus","Acura"};
	for(int a=0; a<cars.length;a++) {
		System.out.print(cars[a]+" ");
	}
	
	//getting values from array using enhanced for loop:
	/*
	 * for(DataType new variable name:name of the array)
	 * 
	 */
	
	for(String carType:cars) {
		System.out.println(carType+" ");
	}
	
	
}
}
