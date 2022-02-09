package com.sandcoder.number.operations;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		int factorial = 1;
		for(int i = input; i>0 ; i--) factorial = factorial*i;
		System.out.println("The factorial of "+ input + " is " + factorial);
		sc.close();
	}
}
