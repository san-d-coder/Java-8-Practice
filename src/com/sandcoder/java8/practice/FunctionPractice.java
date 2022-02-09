package com.sandcoder.java8.practice;

import java.util.Arrays;
import java.util.List;

//Print out the square of all elements in a list
public class FunctionPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		//Traditional approach 
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i)*list.get(i));
		}
		
		//Lambda Approach
		list.stream().map(t->t*t).forEach(System.out::println);

	}

}
