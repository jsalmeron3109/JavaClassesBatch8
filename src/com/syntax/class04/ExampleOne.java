package com.syntax.class04;

public class ExampleOne {
//example of nesting if 
	public static void main(String[] args) {
		// check if assignment is completed
		//if assignment is completed, check score
		//if score>90 ->great job
		//if score>80 ->good job
		//if score>70 ->study more
		
		boolean complete=true;
		int score=92;
		
		if (complete) {
			if(score>90) {//score is 92
				System.out.println("You did a great job!");//this line will print
			}else if(score>80){
				System.out.println("You did a good job!");
			}else if(score>70) {
				System.out.println("Thank you for trying but study more.");
			}
			
		}else {
			System.out.println("You shoould always complete all assignments");
		}
		

	}

}
