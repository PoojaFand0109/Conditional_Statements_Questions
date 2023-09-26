package com.conditional_statements;

import java.util.Scanner;

public class Positive_Negative_Zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(" The number is positive ");
		} else if (num < 0) {
			System.out.println("he number Tis negative ");
		} else {
			System.out.println(" The number is zero");
		}
	}
}
