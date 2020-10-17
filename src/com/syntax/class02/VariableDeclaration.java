package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1st way to create a variable:
		
		//create variable = assigning value
		//declare variable = initializing 
		double $num=12.99;
		
		//2 way to create a variable:
		  //declare a variable
		   int myBox; //variable declaration happens only once!
		 //initialize or assign value
             myBox=135; //assign value- can be done multiple times
             System.out.println(myBox); //135
             myBox=155; //reassign value
             System.out.println(myBox); //155 replaces 135 value
             
             //3 way example:
             int num1,num2,num3; //if variable is of same type, we can declare in one line
             num1=10;
             num2=20;
             num3=30;
             
             //example of assignement operator (=)
             
             char char1='C';
             char char2='d';
             char char3=char1;
             
             System.out.println(char3); //output will be C
             
             
             
           
        
	}

}
