package com.tec.copy;

public class Pattern_Program7 {

	public static void main(String[] args) {
		int space=-1;
		for(int i=1; i<=5; i++) {
			space++;
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
