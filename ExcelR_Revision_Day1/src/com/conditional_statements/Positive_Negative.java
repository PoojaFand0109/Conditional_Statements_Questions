package com.conditional_statements;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + "is positive number");
		}

		else {
			System.out.println(num + "is negative number");
		}
	}
}
