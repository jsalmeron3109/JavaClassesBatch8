package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1, num2;
		num1=10;
	    num2=12;
	    
	    System.out.println(num1+num2);//java prints: 22
	    //+ operates as arithmetic operator in numeric variables
	    //Arithmetic Operators: +,-,*,/,%
	    
	    double num3=10.99;
	    double num4=2.99;
	    //how to show: multiply 2.99 and 10.99
	    double mult=num3*num4;
	    
	    System.out.println(mult);//java prints calculation:32.8601
	    
	    double div=num3/num4;
	    System.out.println(div);//3.6755852842809364
	    
	    float f=10.99f;
	    float f1=2.99f;
	    System.out.println(f/f1);//3.6755853
	    
	    //difference btw double and float: float can take up to 5-6 decimal points, double up to 15
	    
	    //how to add text into value quotation: USE STRING " "
	    System.out.println("The result of division of 2 float values="+f/f1);
	    //^^The result of division of 2 float values=3.6755853 
	    
	    //TASK PRACTICE:
	    float val1=3.51f;
	    float val2=7.12f;
	          
	    float sum1=val1+val2;
	    
	  System.out.println("The Sum of 2 numbers "+val1+" and "+val2+"is equal to"+" "+sum1);
	  
	  double var=3.9;
	  double varSquare=var*var;
	  System.out.println("The square of "+var+" is "+varSquare);
			  
	  int width=5;
	  int height=8;
	  
	  int area=width*height;
	  int perimeter=width+height*2;
	  
	  System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
	          
	          
	    
	    
	}

}
