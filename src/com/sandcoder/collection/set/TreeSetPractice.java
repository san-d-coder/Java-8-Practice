package com.sandcoder.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

//Unique elements, no nulls, ascending order
public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		//Elements added in random order
		set1.add(37);
		set1.add(25);
		set1.add(22);
		set1.add(1);
		
		//Maintains sorted order
		for(int i: set1) {
			System.out.println(i);
		}
		
		System.out.println("**********************************************");
		
		//Descending order
		Iterator<Integer> iterator = set1.descendingIterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Highest Value of the Set is: "+set1.last());
		System.out.println("Lowest Value of the Set is: "+set1.first());
		
		//Remove the first value
		set1.pollFirst();
		
		//Remove the last value
		set1.pollLast();
		
		//updated set
		System.out.println(set1);
		
		//clear the set
		set1.clear();
		
		System.out.println("Empty set: "+set1);

	}

}
