package com.sandcoder.string.operations;

import java.util.Arrays;
import java.util.Scanner;

public class CountCharAtString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char temp = Character.MIN_VALUE;
		int count = 0;
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine().toLowerCase();
		
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		for(int i=0;i<c1.length;i++) {
			for(int j = 0; j<c1.length;j++) {
				if(c1[j]==c1[i])
					count++;
			}
			if(c1[i]!=temp) {
				System.out.println("The char '"+c1[i]+"' is present "+ count + " times");
				temp = c1[i];
				count = 0;
			}
			else {
				count = 0;
				continue;
			}
		}
		sc.close();
	}

}
