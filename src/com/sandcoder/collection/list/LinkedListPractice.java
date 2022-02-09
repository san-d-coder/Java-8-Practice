package com.sandcoder.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		// LinkedList Implementation
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		// Iterating using ForEach
		for (int i : list1) {
			System.out.println(i);
		}

		System.out.println("********************************");

		// Linked list modifications are very fast
		list1.add(4);
		list1.remove(2);

		// LinkedList find operations take the longest
		for (int i = 0; i < list1.size(); i++)
			System.out.println(list1.get(i));
	}

}
