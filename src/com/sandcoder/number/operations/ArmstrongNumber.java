package com.sandcoder.number.operations;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		int inputCopy = input;
		int sum = 0;
		while(input > 0) {
			sum += ((input%10)*(input%10)*(input%10));
			input /= 10;
		}
		
		if(inputCopy==sum)
			System.out.println("Armstrong!");
		else
			System.out.println("Not!");
		sc.close();
		
	}

}
