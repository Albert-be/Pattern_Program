package com.tec;

public class Pattern_Program8 {

	public static void main(String[] args) {
		
		int star=-1;
		int space=5;
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
			star+=2;
			space--;
			}
			else {
				star-=2;
				space++;
			}
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
