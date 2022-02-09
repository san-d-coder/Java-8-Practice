package com.sandcoder.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		// Data population using Arrays.aslist, modification not supported
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		Iterator<Integer> iterator = list1.iterator();
		// Iterating using iterator:
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("********************************");

		// Displaying the whole list:
		System.out.println(list1);

		System.out.println("********************************");

		List<Integer> list2 = new ArrayList<>();

		// Adding elements
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		// Adding as collection
		list2.addAll(list1); // As Arrays.asList does not allow modifications

		// Iterating using Enhanced For loop
		for (int i : list2)
			System.out.println(i);

		// Removing elements
		list2.remove(0); // removing using index
		list2.remove(6); // removing direct object

		list2.removeAll(list1); // removing whole collection

		System.out.println("********************************");

		// Iterating using for loop
		for (int i = 0; i < list2.size(); i++)
			System.out.println(list2.get(i));

		System.out.println("********************************");

		// Querying element
		// Iterating using ForEach and Stream API
		list2.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}

}
