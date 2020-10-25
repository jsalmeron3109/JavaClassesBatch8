package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] prefix= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"} 
				};
	
			System.out.println(prefix[0][1]+" "+prefix[1][0]);
			System.out.println(prefix[0][0]+" "+prefix[1][3]);
			System.out.println(prefix[0][2]+" "+prefix[1][2]);
			System.out.println(prefix[0][3]+" "+prefix[1][1]);
	}

}
