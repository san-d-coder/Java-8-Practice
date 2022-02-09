package com.sandcoder.string.operations;

import java.util.Scanner;

public class DeleteWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int spaceCount = 0;
		int index = 0;
		System.out.println("Enter the string with spaces");
		String input = sc.nextLine();
		input = input.trim();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ')
				spaceCount++;
		}
		char[] c1 = new char[input.length()-spaceCount];
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ')
				continue;
			else {
				c1[index] = input.charAt(i);
				index++;
			}	
		}
		input = String.valueOf(c1);
		System.out.println(input);
		sc.close();
	}
}
