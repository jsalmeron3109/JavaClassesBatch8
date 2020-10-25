package com.syntax.grouptask;

public class Task4 {
	public static void main(String[] args) {
		  System.out.println("--------------TASK4-------------------");
		  int[] num= {50, -38, 71, 3, 80, -10, 99};
		  int maxNum=num[0];
		  for(int i=0; i<num.length; i++) {
			  if(num[i]>maxNum) {
				  maxNum=num[i];
			  }
		  }
		  System.out.println("The maximum number in the array is "+maxNum);
		  int minNum=num[0];
		  for(int j=0; j<num.length; j++) {
			  if(num[j]<minNum) {
				  minNum=num[j];
			  }
		  }
		  System.out.println("The minimum number in the array is "+minNum);
		}

}
