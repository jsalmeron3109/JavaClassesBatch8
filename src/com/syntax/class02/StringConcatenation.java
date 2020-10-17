package com.syntax.class02;

public class StringConcatenation {
	public static void main(String[] args) {
	//to concatenate or attache ANY value (char,int,double)to String use + (String concatenation operator)
		String name="John";
		//How to say: My name is John
		System.out.println("My name is "+name);
		
		String lastName="Smith";
		//How to print: John Smith
		System.out.println(name+lastName); //<-- will print: JohnSmith
		
		//how to add space in btw name and last name:
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//how to say: John lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//how to say: John is a B student
		System.out.println(name+" is a "+grade+" student");
		
		int age=21;
				//how to say: John is 21 years old
		System.out.println(name+" is "+age+" years old");
		
		//everything inside the "" in a string matters!:
		String state="DC";
		String anotherState=" DC";
		//these do not equal because anotherState has 3 characters and state has 2
		System.out.println(state);
		System.out.println(anotherState);

	}
}
