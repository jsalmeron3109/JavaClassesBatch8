package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=13;
		
		if(time>12){
			System.out.println("good day");
		}
		////////            while loop               ///////
		while (time>12) {
			System.out.println("good day");// <- this code will print infinite times
			time--;//decrement value, condition no longer met, stops code from executing
		
		//while (time>12){
		  //System.out.println("good day");
			//time++;  <---this will increment value, code will continue infinite times
		}
	/// example: print numbers from 1 to 50 using loop:
		
		int num=1;
		while (num<=50) {
			System.out.println(num);
			num++;
		}
		int evenNum=10;//example to print even numbers from 10-30
		while (evenNum<=30) {
			System.out.println(evenNum);
			evenNum+=2;
	}
		
		int oddNum=99;//example to print odd numbers from 1-100
		while (oddNum>0) {
				System.out.println(oddNum);
				oddNum-=2;
			
		}
	}
}
