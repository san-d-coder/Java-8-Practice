package com.sandcoder.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Stored using Hashcode, No order maintained
public class HashMapPractice {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Sandeep", 26);
		hashMap.put("Somnath", 31);
		hashMap.put("Pomi", 18);
		hashMap.put("Sana", 26);
		hashMap.put("Munu", 5);

		System.out.println("Map contains: " + hashMap); // No insertion order

		// Preparing entrySet

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next()); // Printing an entry at a time

		hashMap.remove("Munk"); //returns Null as nosuch key

		// Using Stream

		hashMap
		.entrySet()
		.stream()
		.sorted(Entry.comparingByKey())
		.forEach(System.out::println);

		System.out.println("\n\nReverse Order\n\n");

		hashMap
		.entrySet()
		.stream()
		.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}

}
