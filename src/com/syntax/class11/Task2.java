package com.syntax.class11;

public class Task2 {
public static void main(String[] args) {
	//Create an array of cars : american, german, korean, italian.
	//print all values from a 2D array
	
	String [][]cars= {
			{"Jeep","Dodge","Ford"},
			{"BMW","Mercedes","Audi"},
			{"Hyundai","Genesis","Kia"},	
			{"Ferrari","Lambourghini","Maserati"}
			
			};
	
	for(int i=0; i<cars.length;i++) {
		for(int j=0;j<cars[i].length;j++) {
			String car=cars[i][j];
			System.out.print(car+" ");
		}
		System.out.println();
	}
	
	//same output using enhanced for loop:
	
	for(String[]carArray:cars) {
		for(String carType:carArray) {
			System.out.print(carType+" ");
		}
		System.out.println();
	}
}
}
