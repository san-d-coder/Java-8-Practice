package com.sandcoder.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		System.out.println("Size of an empty Queue: "+q.size());

		// Populating Queue
		for (int i = 0; i < 10; i++)
			q.add(i);

		System.out.println("Size after insertion: "+q.size());
		// Traversing
		for (int i : q)
			System.out.println(i);

		// Queue Methods

		// Retreive head -> FIFO
		System.out.println("Head: " + q.peek());
		
		//Remove head -> FIFO with null
		System.out.println("Head removed "+ q.poll());
		
		//Updated head:
		System.out.println("Updated head: "+q.peek());
		
		//Remove - will throw exception on empty thread
		System.out.println("Deleting head: "+q.remove());
		
		System.out.println("Updated Queue: "+q);
		
		Integer[] a = new Integer[q.size()];

		//Using the toArray method
		q.toArray(a);
		
		for(Integer i: a)
			System.out.println(i);
	}

}
