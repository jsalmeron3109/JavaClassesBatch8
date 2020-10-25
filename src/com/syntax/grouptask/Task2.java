package com.syntax.grouptask;

public class Task2 {
	public static void main(String[] args) {
		
	
	int num = 29;
    boolean zebra = false;
    for(int i = 2; i <= num/2; ++i)
    {
        if(num % i == 0)
        {
            zebra = true;
            break;
        }
    }
    if (!zebra)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
}	
}


