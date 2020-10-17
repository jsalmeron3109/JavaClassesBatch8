package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter day of week in a number");
	int day=scan.nextInt();
	
	if(day==1) {
		System.out.println("Today is Monday, we have no class");
	}else if(day==2) {
		System.out.println("Today is Tuesday, we have Manual Class");
  }else if(day==3) {
	  System.out.println("Today is Wednesday, we have Manual Class again");
  }else if (day==4) {
	  System.out.println("Today is Thursday, we have Review class");
  }else if(day==5) {
	  System.out.println("Today is Friday, I have class tomorrow and will study");
  }else if(day==6) {
	  System.out.println("Today is Saturday, I have Java class");
  }else if(day==7) {
	 System.out.println("Today is Sunday, I did a lot of coding");
	 
  		} else {
  			System.out.println("This is an invalid day of the week");
  		}
	////////////same example using switch case:
	String today;
	
	switch (day) {//datatype must match, ex (day) variable is int
	case 1://case value must be int
		today="Monday";
		break;//break is used to stop executing code if the case variable is true
	case 2:
		today="Tuesday";
		break;
	case 3:
		today="Wednesday";
		break;
	case 4:
		today="Thursday";
		break;
	case 5:
		today="Friday";
		break;
	case 6:
		today="Saturday";
		break;
	case 7:
		today="Sunday";
		break;
		default://default is similar to else in if/else statement
			today="Invalid day";
			break;
	}
	System.out.println("Today is "+today);
	
}
}
