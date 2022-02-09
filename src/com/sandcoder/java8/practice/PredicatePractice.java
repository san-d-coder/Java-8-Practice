package com.sandcoder.java8.practice;

import java.util.List;

//Print the even numbers from the entered List:
public class PredicatePractice {

	public static void main(String[] args) {

		List<Integer> list = new ListDao().getIntegers();

		// traditional approach:
		for (int i : list) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		// Lambda Approach
		list.stream().filter((t) -> t % 2 == 0).forEach(System.out::println);

	}

}
