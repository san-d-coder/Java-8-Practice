package com.sandcoder.string.operations;

import java.util.Scanner;


//Take the first element
//Compare with the next element
//if same -> take beginIndex,start counting until different
//tempString -> input.substring(beginIndex,endIndex)
//checkSize->if biggest -> Store in longestSequence, else continue
//startIndex = endIndex
//repeat from top


public class LongestRepeatingSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j=0;
		int count = 0;
		int beginIndex = 0;
		int endIndex = 0;
		int maxSize = 0;
		String temp = "";
		String longestSequence = "";

		System.out.println("Enter a String containing repeating sequence: ");

		//check for a repeating sequence:
		
		
		String input = sc.nextLine();
		//take the start of sequence
		while(beginIndex<input.length()-1) {
		for(j=beginIndex;j<input.length()-1;j++) {
			if(input.charAt(j)==input.charAt(j+1)) { //if match found
				beginIndex=j;
				break;
			}
		}
		if(j==input.length()-1) {
			longestSequence = "Not a sequence";
			break;
		}
			
		//take the end of the sequence
		for(int i=beginIndex;i<input.length()-1;i++) {
			if(input.charAt(i)==input.charAt(i+1))
				count++;
			else
				break;
		}
		endIndex = beginIndex+count+1; //as endIndex is exclusive
		//form a substring 
		temp = input.substring(beginIndex,endIndex);
		//measure the size
		if(maxSize<temp.length()) {
			maxSize = temp.length();
			longestSequence = temp;
		}
		beginIndex = endIndex-1;
		count = 0; 
		}
		System.out.println(longestSequence);
		sc.close();
	}
}
