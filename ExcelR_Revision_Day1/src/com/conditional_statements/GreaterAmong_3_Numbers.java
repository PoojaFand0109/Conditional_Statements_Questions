package com.conditional_statements;

import java.util.Scanner;

public class GreaterAmong_3_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		System.out.println("Enter third number:");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "is greater number");
		} else if (b > a && b > c) {
			System.out.println(b + "is greater number");
		} else {
			System.out.println(c + "is greater number");
		}
	}
}
