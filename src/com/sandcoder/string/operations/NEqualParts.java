package com.sandcoder.string.operations;

import java.util.Scanner;

public class NEqualParts {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		int size = input.length();
		System.out.println("Enter the number of divisions: ");
		int divisions = Integer.parseInt(sc.nextLine());
		int segments = 0;
		int count = 0;

		if (size % divisions != 0) {
			System.out.println("Not divisible in equal parts");
		} else {
			segments = size / divisions;
			String[] s1 = new String[divisions];
			for (int i = 0; i < size; i = i + segments) {
				s1[count] = input.substring(i, i + segments);
				count++;
			}
			for (int i = 0; i < s1.length; i++)
				System.out.println(s1[i]);
		}
		sc.close();
	}
}