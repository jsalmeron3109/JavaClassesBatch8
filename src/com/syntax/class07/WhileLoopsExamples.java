package com.syntax.class07;

public class WhileLoopsExamples {
	public static void main(String[] args) {
		String day1="Saturday";
		
		if(day1.equals("Saturday")) {
			System.out.println("Today I have Java class");
		}
		
		while(day1.equals("Saturday"))
		{
		System.out.println("Today I have Java class");
		day1="Sunday";
		break;
		}
	    
	
	///// Task//////
	
		boolean workDay = true;
		int day = 1;
		if (workDay) {
			while (day<6) {
				System.out.println("I need a day off");
				day++;
			}
			while (day==6) {
				System.out.println("I don't need a day off anymore");
				break;
			}
		}
	}
}

