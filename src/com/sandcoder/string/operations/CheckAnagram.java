package com.sandcoder.string.operations;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "Anagram";
		System.out.println("Enter the first string: ");
		String s1 = sc.nextLine();
		String string1 = s1.toLowerCase();
		System.out.println("Enter the second string: ");
		String s2 = sc.nextLine();
		String string2 = s2.toLowerCase();
		
		//check if the length 
		if(string1.length() != string2.length())
			result = "Not Anagram";
		else {
			//convert string into character arrays
			char[] c1 = string1.toCharArray();
			char[] c2 = string2.toCharArray();
			//sort the arrays
			Arrays.sort(c1);
			Arrays.sort(c2);
			//compare
			for(int i=0;i<c1.length;i++) {
				if(c1[i]!=c2[i])
					{
					result = "Not Anagram";
					break;
					}
				else
					continue;
			}
				
		}
		System.out.println(result);
		sc.close();
	}

}
