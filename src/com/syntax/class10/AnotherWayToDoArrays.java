package com.syntax.class10;

public class AnotherWayToDoArrays {
public static void main(String[] args) {
	
	String[]names= {"Ben","Brad","Miles","Jack","John"};
	//cannot declare values again outside of {}^
	
	System.out.println(names[3]);
	//how do I know how many elements are in the array?
	int size=names.length;
	
	System.out.println("Amount of names in the array: "+size);
	
	System.out.println(names[names.length-2]);//Jack
	int a=2;
	System.out.println(names[a]);//Miles
	a+=2;
	System.out.println(names[a]);//John
	
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
}
}
