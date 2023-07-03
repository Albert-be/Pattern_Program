package com.tec.copy;

public class Pattern_Program11 {

	public static void main(String[] args) {
		int star=0;
		int space=5;
		for(int i=1; i<=5; i++) {
			star++;
			space--;
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
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

