package com.syntax.class08;

public class ContinueKeyword {
	public static void main(String[] args) {
		//print number 1 to except #3
		
		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;//continue will jump to next iteration of loop
			}
			System.out.println(i);//1,2,4,5 will print
		}
		
		//print numbers from 1 to 10 except 3 and 7:
		
		for(int a=1; a<=10; a++) {
			if(a==3 || a==7) {
				continue;
			}
			System.out.println(a);
		}
	}

}
