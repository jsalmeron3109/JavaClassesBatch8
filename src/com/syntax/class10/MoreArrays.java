package com.syntax.class10;

public class MoreArrays {
public static void main(String[] args) {
	
	char[]grade= {'A','B','C','D','F'};
	char sendValue=grade[1];
	
	String[] names= {"Mike", "Donald","Pat","Bryan"};
	String secondVal=names[1];
	
	//get all values from grade array:
	for(int i=0; i<grade.length; i++) {
		char valueFromArray=grade[i];
		System.out.println(valueFromArray);
	}
	
}
}
