package com.sandcoder.string.operations;

import java.util.Scanner;

public class TotalNumberOfCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		//with no spaces
		int size = s1.length();
		int count = 0;
		System.out.println("Size of string including spaces: "+size);
		//with spaces
		for(int i = 0; i<s1.length();i++)
		{
			if(s1.charAt(i) != ' ')
				count++;
			else
				continue;
		}
		System.out.println("Size of string excluding spaces: "+count);	
		sc.close();
	}

}
