package com.syntax.class03;

public class CompundOperators {
       public static void main(String[] args) {
		int num=100;
		num=num+10;
		System.out.println(num);//110
		
		num=num+200;
		System.out.println(num);//310
		
		//how to get result done faster in java ->compound assignment operator 
		//compound operaters: +=, -=, *=, /=, %=
		
		int myNumber=100;
		    myNumber+=10;//110
		    System.out.println(myNumber);//110
		    
		    myNumber+=200;
		    System.out.println(myNumber);//310
		    
		    myNumber-=100;
		    System.out.println(myNumber);//210
		    
		    myNumber/=10;
		    System.out.println(myNumber);//21
		    
		    myNumber *=1000;
		    System.out.println(myNumber);//21000
		    
		    myNumber%=100;
		    System.out.println(myNumber);//0
		    
		    
		    
	}
}
