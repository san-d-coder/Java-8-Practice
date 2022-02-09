package com.sandcoder.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

//Similar to hashset, but maintains insertion order
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<>();
		for(int i = 0; i<10;i++)
			set1.add(i);
		
		//Maintains insertion order
		System.out.println("Linked HashSet after inserting elements: "+ set1);
	}

}
