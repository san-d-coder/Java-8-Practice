package com.sandcoder.string.operations;

import java.util.Scanner;

public class ReverseWithoutReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		char[] c1 = input.toCharArray();
		char[] c2 = new char[c1.length];
		int index = 0;
		for(int i = c1.length-1;i>=0;i--) {
			c2[index] = c1[i];
			index++;
		}
		System.out.println("Original: "+input);
		input = String.valueOf(c2);
		System.out.println("Reverse: "+input);
		sc.close();
	}

}
