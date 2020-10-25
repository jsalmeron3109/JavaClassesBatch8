package com.syntax.class11;

public class Creating2DArray {
public static void main(String[] args) {
	//create a 2D array for food
	//seperate arrays by food type: American, Italian, Asian, Mexican, Indian
	
	String [][]food= {
			{"Burgers","Hot Dog"},
			{"Pizza","Pasta","Cannoli"},
			{"Dumplings","Sushi","Fried Rice"},
			{"Tacos","Quesadilla","Burrito"},
			{"Briyani","Chicken Masala","Curry Chicken"}
	};
	
	for(String[] dishes:food) {
		for(String dish:dishes) {
			System.out.print(dish+" ");
		}
		System.out.println();
	}
	
	/////using nested for loop:
	
	for(int i=0;i<food.length;i++) {
		for(int j=0;j<food[i].length;j++) {
			System.out.print(food[i][j]+" ");
		}
		System.out.println();
	}
 }
}
