package com.syntax.class04;

public class IfElseIf {
	
public static void main(String[] args) {
	//need to compare 2 numbers: bigger, smaller or equal
	
	int num1=19;
	int num2=99;
	
	if(num1>num2) {//what if this condition is tru
		System.out.println(num1+" is bigger than "+num2);
	} else if(num1<num2) {//or what if this condition is true
		System.out.println(num1+" is smaller than "+num2);//this syntax will run since this is true
	} else {
		System.out.println(num1+" is equal to "+num2);
	}
//task:based on day of week we will print class schedule
	int day=7;
	
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
	}
}
