package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		//variable for allergy - yes or no
		//if yes- check for pet allergy, nut allergy, pollen allergy
		
		boolean allergy=true;
		boolean nutAllergy=true;
		boolean petAllergy=false;
		boolean pollenAllergy=false;
		
		if(allergy) {
			System.out.println("I have an allergy, let's do further check");
			if(nutAllergy) {System.out.println("I have a nut allergy");
			
		}else {
			System.out.println("No allergy, you are lucky");
		}
	}
		//Task:If today is Friday, we will watch movies but would like to check date
		//If date is 13th, watching a scary movie
		//If not, we will watch a romance movie
		//if not firday then no movie, I am studying
		boolean friday=false;
		int date=4;
		boolean monday=true;
		
		if (friday){
			System.out.println("Today is Friday, I am watching a movie");
			if(date==13)
				System.out.println("I will watch a scary movie");
			}else {
					System.out.println("I will watch a romance movie");
		
			}			
	}
	
}
