package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {
		boolean b=!true;//(!) ->will reverse the condition, result will be false
		System.out.println(b);
		
		boolean a=!false;//result will be true
		System.out.println(a);
		
		boolean isCold=true;
		
		if(!isCold) {
			System.out.println("I am going to the beach");//<-does not show on console bc false
		}
		
	}

}
