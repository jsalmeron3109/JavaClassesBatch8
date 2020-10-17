package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//casting in java=converting one type to another type
		//2 types of casting: widening vs narrowing
		//widening= implicit (automatic): byte->short->int->long->float->double
		//narrowing= explicit (manual):double->float->long->int->short->byte
		double d=12/7;
		System.out.println(d);//1.0
		
	//widening example:
		double e=9;
		System.out.println(e);//9.0
		
	//narrowing example:
		//int i=9.99;error message 
		//how to expicitly convert double to int:
		int i=(int)9.99;//9
		
		double a=500.4444;
	    long b=(long)a;
	    
	    System.out.println(b);

	}

}
