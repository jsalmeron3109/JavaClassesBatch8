package com.syntax.class05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class hW1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	boolean thirsty;
	boolean sleepy;
	
	System.out.println("Are you thirsty?");
	thirsty=scan.nextBoolean();
	System.out.println("Are you sleepy?");
	sleepy=scan.nextBoolean();
	
	if(thirsty && !sleepy) {
		System.out.println("drink=Water");
	}else if(thirsty && sleepy) {
		System.out.println("drink=Coffee");
	}else if(!(thirsty && sleepy)) {
		System.out.println("drink=Tea");
	}else {
		System.out.println("drink=Nothing");
	}
	
	
}
}
