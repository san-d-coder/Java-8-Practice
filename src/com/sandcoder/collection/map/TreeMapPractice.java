package com.sandcoder.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Stored using Tree DS, Ascending order on keys maintained
public class TreeMapPractice {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Sandeep", 26);
		treeMap.put("Somnath", 31);
		treeMap.put("Pomi", 18);
		treeMap.put("Sana", 26);
		treeMap.put("Munu", 5);
		treeMap.put("Abani", 72);
		treeMap.put("Mina", 57);
		System.out.println("Sorting done by key done by default\n\n");
		treeMap.entrySet().forEach(System.out::println);

		System.out.println("\n\nComparator to sort by Value\n\n");
		treeMap.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);

	}

}
