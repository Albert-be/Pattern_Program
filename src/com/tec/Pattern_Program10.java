package com.tec;

public class Pattern_Program10 {
	public static void main(String[] args) {
		int star=0;
		for(int i=1; i<=5; i++) {
			star++;
			for(int j=1; j<=star; j++) {
				if((i==3&j==2)||(i==4&j==2)||(i==4&j==3)) {
				System.out.print(" ");
			}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
