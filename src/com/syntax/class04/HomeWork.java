package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		
		
	 	Scanner inp = new Scanner(System.in);
	  	System.out.println("Is it sunny outside?");
	  	boolean isSunny=inp.nextBoolean();
	  	 	
	  	 	
	  	 	if(isSunny)
	  	 	{System.out.println("It is a sunny day, I should go somewhere!");
	  	 	
	  	 		System.out.println("What is the temperature outside?");
	  	int temp=inp.nextInt();
	  	
	  	 	 if(temp>85)
	{System.out.println("I am going to the beach");}
	else{System.out.println("I am going to the park");}
	  	 	}
	  	 	else {System.out.println("I stay home and practice Java");}
	  	 	
	  	 	
	}
	}
	
			
	

