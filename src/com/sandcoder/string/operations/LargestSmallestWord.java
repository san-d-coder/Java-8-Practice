package com.sandcoder.string.operations;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LargestSmallestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int index = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine().trim();
		for(int i = 0; i<sentence.length();i++) {
			if(sentence.charAt(i)== ' ')
				count++;
		}
		StringTokenizer st = new StringTokenizer(sentence," ");
		String[] words = new String[count+1];
		while(st.hasMoreTokens()) {
			words[index] = st.nextToken();
			index++;
		}
		
		for(int i=0;i<index;i++) {
			String temp = words[i];
			max = temp.length()>max?temp.length():max;
		}
		
		for(int i=0;i<index;i++) {
			if(words[i].length()==max)
				System.out.println("Largest word is: "+words[i]);
		}
		
		for(int i=0;i<index;i++) {
			String temp = words[i];
			min = temp.length()<min?temp.length():min;
		}
		
		for(int i=0;i<index;i++) {
			if(words[i].length()==min)
				System.out.println("Smallest word is: "+words[i]);
		}
		sc.close();
	}

}
