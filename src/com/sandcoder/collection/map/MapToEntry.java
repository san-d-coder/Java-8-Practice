package com.sandcoder.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapToEntry {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sandeep", 26);
		map.put("Somnath", 31);
		map.put("Abani", 72);
		map.put("Ashok", 59);
		// Convert Map to EntrySet
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("Key - Value");
		for (Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey() + " - " + entry.getValue());

		Map<String, Integer> map2 = new LinkedHashMap<>();
		// Convert EntrySet to Map
		for (Entry<String, Integer> entry : entrySet)
			map2.put(entry.getKey(), entry.getValue());

		System.out.println("Resumed Map: " + map2);

		// Converting using StreamAPI

		Map<String, Integer> map3 = new HashMap<>();
		map3 = entrySet.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println("Resumed Map: " + map3);

	}

}
