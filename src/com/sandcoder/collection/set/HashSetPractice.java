package com.sandcoder.collection.set;

import java.util.HashSet;
import java.util.Set;

//Elements stored based on hashcode, no insertion order maintained
public class HashSetPractice {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();

		for (int i = 1; i < 10; i++) {
			set1.add(i*i);
		}
		//No insertion order maintained as Hashing is used to store
		System.out.println("After insering elements: "+set1);
		
		set1.remove(36);
		
		System.out.println("After removal of 36: "+set1);
		
		set1.add(36);

		//Gets stored in the same place due to hashing
		System.out.println("After readding 36: "+set1);
		
		set1.clear();
		
		System.out.println("After clear operation: "+set1);

	}

}
