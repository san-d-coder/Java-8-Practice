package com.sandcoder.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequePractice {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		System.out.println("Size of an empty Deque: " + dq.size());
		// Populating
		for (int i = 0; i < 10; i++)
			dq.add(i);
		System.out.println("Size of the Deque after population: " + dq.size());
		// iterating
		Iterator<Integer> iterator = dq.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		// Deque specific features

		// Adding element using OfferFirst

		dq.offerFirst(-1);

		// Adding element using Push

		dq.push(-2);

		// Adding element using AddFirst
		dq.addFirst(-3);

		// Adding element using OfferLast - same as Offer

		dq.offerLast(10);

		// Adding element using AddLast

		dq.addLast(11);

		System.out.println("The head of the Deque is: " + dq.peekFirst());
		System.out.println("The tail of the Deque is: " + dq.peekLast());

		// Removing the head
		dq.poll(); // same as PollFirst()

		// Removing using Remove

		dq.remove();

		// Removing specific element
		dq.remove(6);

		// Removing the tail
		dq.pollLast();

		// Iterate after Polls
		dq.stream().forEach(System.out::println);

		// Empty DQ
		dq.clear();

		System.out.println("Size after Clear: " + dq.size());

	}

}
