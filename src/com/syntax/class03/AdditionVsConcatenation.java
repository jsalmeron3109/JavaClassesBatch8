package com.syntax.class03;

public class AdditionVsConcatenation {
	public static void main(String[] args) {
		//type main,ctrl,space to enter main method
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Friends";
		
		System.out.println(a+b+x+y); //300HelloFriend
		System.out.println(a+x+b+y); //100Hello200Friends
		System.out.println(x+y+a+b);//HelloFriends100200 <--why?
		//code executes left to right, string variable to the left (+) will concatenate
		//how to get HellFriends300:
		System.out.println(x+y+(a+b)); //adding parenthesis to operation will show java order of operations
		
		
		
	}

}
