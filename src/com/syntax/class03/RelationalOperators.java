package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		//examples of relational operator: <,>,
		//equal to: ==
		//not equal to: !=
		//results will always be in true or false
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		int x=100;
		int y=90;
		
		boolean result= x>y;//x greater than y?
		System.out.println(result);//true
		
		result=x==y;//->is 90 equal to 100?
		System.out.println(result);//false
		
		//difference btw = and ==
		System.out.println(x==y);//comparing if variable x is equal to variable y; answer is false
		System.out.println(x=y);//assigning value of y to variable x; answer is 90
		System.out.println(x);//90; x is now assigned value 90
		
		boolean result1=x==y;
		System.out.println(result1);//true; x was reassigned value 90 so 90=90.
		
		byte num=10;
		byte num1=10;
		
		boolean boo=num>=num1;
		System.out.println(boo);//true
		
		

	}

}
