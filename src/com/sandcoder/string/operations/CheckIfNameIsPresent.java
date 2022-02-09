package com.sandcoder.string.operations;

import java.util.Scanner;

public class CheckIfNameIsPresent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter the name");
		String name = sc.nextLine().toLowerCase();
		if(s1.contains(name))
			System.out.println("Contains");
		else{System.out.println("Doesn't");}
		sc.close();
	}
}
  
  