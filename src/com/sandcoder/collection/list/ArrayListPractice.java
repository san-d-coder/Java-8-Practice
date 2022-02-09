package com.sandcoder.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// Array List Implementation
		List<String> list1 = new ArrayList<>();
		list1.add("Sandeep");
		list1.add("Rahul");
		Iterator<String> iterator = list1.iterator();
		// List preserves insertion order:
		while (iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("********************************");
		// ArrayLists are best for search operations because of the index
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("********************************");
		// ArrayLists are worst for modifications
		// as whole ArrayList had to be modified, consuming more time

		list1.add(1, "Ali");
		list1.remove(0);

		// modified ArrayList:
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("********************************");
	}
}
