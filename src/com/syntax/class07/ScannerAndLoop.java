package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
public static void main(String[] args) {
	//Ask user what is his name 3 times -> print "hello + name"
	Scanner scan=new Scanner(System.in);
	String name;
	int number=1;
	while (number<=3) {
		System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("hello "+name);
		number++;
		}
	
	
	}
}
