package com.xworkz.PatternPrograms;

public class LeftTriangle {

	public static void main(String[] args) {
		
		for(int i=0 ; i<=4 ; i++) {
			for(int j=0 ;j<=4 ; j++) {
				
				if(j>=i && i+j>=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
			
	}

	}


