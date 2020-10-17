package com.syntax.class05;

import java.util.Scanner;

public class homeWork2 {
	public static void main(String[] args) {
		
	
	 Scanner scan=new Scanner(System.in);
	  System.out.println("Do you need a loan?");
	  boolean loan=scan.nextBoolean();
	 
	  if(loan) { 
		  System.out.println("What is your credit score?");
	  }else {
		  System.out.println("The eligibility is Unkown");
	  }
	  int credit=scan.nextInt();
	  	if (credit<600) {
			System.out.println("The eligibility is not eligible");
		}else if(credit>600 && credit<700) {
			System.out.println("The eligibility is maybe eligible");
		}else if(credit>701 && credit<800) {
			System.out.println("The eligibility is eligible");
		}else if(credit>800){
			System.out.println("The eligibility is definitely eligible");
		}
		
	}
}
