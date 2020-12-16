package com.xworkz.PatternPrograms;

public class APattern {

	public static void main(String[] args) {
		
		for(int i=0 ; i<=4 ; i++) {
			for(int j=0 ;j<=4 ; j++) {
				
				if(i==2||i+j==2||(i==1&&j==3||(i==3 && j==0||i==4 && j==0 || i==3 && j==4 || i==4 && j==4 )))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
			
	}
	}


