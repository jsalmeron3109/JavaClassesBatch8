package com.syntax.class10;

public class ArraysIntro {
public static void main(String[] args) {
	//5 students in the class and I need to calculate score
	
	int [] grades=new int[5];
	grades[0]=98;
	grades[1]=80;
	grades[2]=89;
	grades[3]=67;
	grades[4]=77;
	
	int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
	System.out.println("Average score is: "+average);
	
	double[] array;
	array=new double[3];
	
	array[0]=12.99;
	array[1]=10.89;
	//if we forget to add value for element compiler will use default value
	//double default value = 0.0
	//int default value = 0
	
	System.out.println("value of last element= "+array[2]);
	array[2]=5.99;
	System.out.println("new value of last element:"+array[2]);
	
	
	String[] liquid=new String[4];//arrays are fixed in size
	liquid[1]="Water";
	liquid[2]="Tea";
	
	System.out.println(liquid[0]);//null will print bc we didnt enter value for element
}
}
