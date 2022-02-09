package com.sandcoder.string.operations;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		char[] c = new char[input.length()];
		for(int i=0;i<input.length();i++) {
			c[i] = checkCase(input.charAt(i));
		}
		input = String.valueOf(c);
		System.out.println("Inverted Case: "+input);
		sc.close();
	}
	
	public static char checkCase(char input) {
		char output = Character.MIN_VALUE;
		if(Character.isLowerCase(input))
			output = Character.toUpperCase(input);
		else
			output = Character.toLowerCase(input);
		return output;
			
	}
}
