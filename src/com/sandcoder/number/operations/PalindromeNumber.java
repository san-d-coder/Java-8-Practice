package com.sandcoder.number.operations;

import java.util.Scanner;

//121
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		int inputCopy = input;
		int reverse = 0;
		if(input <= 0)
			System.out.println("Invalid number");
		else {
			while(input>0) {
				reverse = reverse*10 + input%10;
				input = input/10;
			}
			
			if(inputCopy == reverse)
				System.out.println(inputCopy + " is a Palindrome Number");
			else
				System.out.println(inputCopy + " is not a Palindrome Number");
		}
		sc.close();
	}
}
