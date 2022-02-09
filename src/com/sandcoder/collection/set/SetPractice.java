package com.sandcoder.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Allows unique elements, no duplicates allowed, nulls are allowed, no insertion order
public class SetPractice {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		System.out.println("The size of an empty set is: " + set1.size());

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		Iterator<Integer> iterator = set1.iterator();
		// Iterating:
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("The set as is: " + set1);

		set1.add(23);
		set1.add(35);
		set1.add(18);

		// HashSet does not maintain insertion order as it's stored based on hashcode
		System.out.println("The modified set is: " + set1);

		set1.add(3);
		//Duplicate element is ignored, no errors or exception
		System.out.println("Set after duplicate element: " + set1);
		
		

	}

}
