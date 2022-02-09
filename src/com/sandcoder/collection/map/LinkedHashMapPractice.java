package com.sandcoder.collection.map;

import java.util.LinkedHashMap;

//Stored using Hashcode but insertion order maintained
public class LinkedHashMapPractice {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Sandeep", 26);
		linkedHashMap.put("Somnath", 31);
		linkedHashMap.put("Pomi", 18);
		linkedHashMap.put("Sana", 26);
		linkedHashMap.put("Munu", 5);
		// Insertion order maintained
		linkedHashMap.entrySet().stream().forEach(System.out::println);
	}

}
