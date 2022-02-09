package com.sandcoder.string.operations;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the delimiter: ");
		String s2 = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s1,s2);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		sc.close();
	}

}
