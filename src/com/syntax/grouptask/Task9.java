package com.syntax.grouptask;

public class Task9 {
	public static void main(String[] args) {
		//Create an array of countries: north america countries, south america countries, 
		//europe countries, asian countries, african countries.
		//Then print all values from that array using 2 different loops 
		//calculate how many total countries been stored.
		
		String [][] countries= {
				{"USA","Canada","Mexico","Costa Rica"},
				{"Brazil","Colombia","Argentina"},
				{"France", "Greece","Italy"},	
				{"Thailand","China","Vietnam"},
				{"Nigeria","Egypt","Ethiopia"}
				
				};
		
		int total=0;
		for(String[] country:countries) {
			for(String countryNames:country) {
				System.out.print(countryNames+" ");
				total++;//prints total elements
			}
			 System.out.println("Total countries stored = "+total);
		}
			
		for(int i=0;i<countries.length;i++) {
			for(int j=0;j<countries[i].length;j++) {
				String country=countries[i][j];
				System.out.print(country+" ");
			}
			System.out.println();
		}
		
	

	}

		}
	
		
			
		
	
	


