package com.sandcoder.java8.practice;

import java.util.Arrays;
import java.util.List;

public class ConsumerPractice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		// TraditionalApproach
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */

		// Lambda Approach
		list.stream().forEach(System.out::println);

	}

}
