package com.syntax.class03;

public class Task1 {
public static void main(String[] args) {
	//1. Declare variable and increase by 100 using shorthand operator
	//2. Declare variable and decrease by 67 using shorthand operator
	//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
	//4. Declare variable cakePiece=25 and divide cakePiece between 7 people . 
	//Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
	
	int var1=100;
			var1+=100;//200
			var1-=67;//133
			System.out.println(var1);
			
			int cakePiece=11;
			cakePiece/=4;
			System.out.println(cakePiece);//2
			cakePiece=25;
			cakePiece/=7;
			System.out.println(cakePiece);//3
			cakePiece%=7;
			System.out.println(cakePiece);//3
			
			
}
}
