package com.sandcoder.string.operations;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFrequent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count=0,max =0;
		char ch = Character.MIN_VALUE;
		System.out.println("Enter the string: ");
		String input = sc.nextLine().toLowerCase();
		char[] c = input.toCharArray();
		Arrays.sort(c);
		for(int i = 0;i<c.length;i++) {
			for(int j = 0; j<c.length;j++) {
				if(c[i]==' ')
					continue;
				else if(c[i]==c[j])
					count++;
				else
					continue;
			}
			if(max<count) {
				max = count;
				ch=c[i];
			}
			count=0;
		}
		System.out.println("Most Frequent: "+ch);
		max = Integer.MAX_VALUE;
		for(int i = 0;i<c.length;i++) {
			for(int j = 0; j<c.length;j++) {
				if(c[i]==c[j])
					count++;
				else
					continue;
			}
			if(max>count) {
				max = count;
				ch=c[i];
			}
			count=0;
		}
		System.out.println("Alphabetically sorted least Frequent: "+ch);
		sc.close();
		}

}
