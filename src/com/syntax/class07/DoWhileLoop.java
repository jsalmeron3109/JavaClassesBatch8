package com.syntax.class07;

public class DoWhileLoop {
	public static void main(String[] args) {
		//do while loop works when condition is false
		
		int a=10;
		
		while(a<15) {//first checks condition
			System.out.println("Hello");//then prints code
			a++;
		} 
		
		///// do while loop  /////
		
		int b=10;//**if we change value to 20, makes condition false
		 do {//prints code first
			 System.out.println("Hi");//**if condition is false, this will still print 
			 b++;
			
		 }while(b<15);///then checks condition
		
	}

}
