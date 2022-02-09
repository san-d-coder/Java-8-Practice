package com.sandcoder.number.operations;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		int primeFlag = 0;
		if (input == 0 || input == 1)
			System.out.println("Not Prime");
		else if (  input == 2 || input == 3)
			System.out.println(input + " is a Prime number");
		else {
			for (int i = 2; i <= input / 2; i++) {
				if (input % i == 0) {
					System.out.println(input + " is not a prime number");
					primeFlag = 1;
					break;
				}
			}
			if (primeFlag == 0)
				System.out.println(input + " is a Prime number");
		}
		sc.close();
	}

}
