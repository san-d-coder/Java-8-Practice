package com.sandcoder.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // No insertion order

		System.out.println("Size of an empty map:" + map.size());
		// Adding elements:
		map.put("Sandeep", 26);
		map.put("Pomi", 18);
		map.put("Ali", 26);
		map.put("Abani", 72);
		map.put("Mina", 57);

		// Converting map to set to traverse through

		Set<Entry<String, Integer>> entrySet = map.entrySet(); // Entry is inner interface in MAP

		for (Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey() + " - " + entry.getValue());

		// Query

		System.out.println(map.get("Pomi"));

		// Remove

		map.remove("Pomi");

		System.out.println("EntrySet: " + entrySet); // Autorefreshes
		System.out.println("Map: " + map);

		// Put if absent:
		map.putIfAbsent("Somnath", 31);

		// Replace
		map.replace("Ali", 26, 27);

		System.out.println("Sorting");
		entrySet.stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Reverse Sorting");
		entrySet.stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		

	}

}
