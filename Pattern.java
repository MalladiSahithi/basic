package com.sahithi;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+ "*");
		}
		sc.close();
	}
}
