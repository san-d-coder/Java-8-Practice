package com.sandcoder.number.operations;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		//Recursive call
		int factorial = factorial(input);
		System.out.println("The factorial of "+ input + " = " + factorial);
		sc.close();
	}
	
	public static int factorial(int input) {
		int result = 0;
		if(input == 0 || input == 1)
			result = 1;
		else
			result = input*factorial(input-1);
		return result;
	}

}
