package com.sandcoder.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		// Initial capacity = 10
		System.out.println("The capacity of an empty stack is: " + stack.capacity());

		for (int i = 0; i < stack.capacity(); i++) {
			stack.add(i);
		}

		Iterator<Integer> iterator = stack.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("The capacity of the stack currently is: " + stack.capacity());

		//Push adds the element ad the end
		stack.push(10);

		// Increases by 10
		System.out.println("The capacity of the stack after push is: " + stack.capacity());

		//displays the last element:
		System.out.println("The last element of the Stack is: " + stack.peek());
		
		//removes the last element
		stack.pop();
		
		System.out.println("The stack after pop: "+ stack);
		
		System.out.println("The capacity after pop: "+ stack.capacity());
		
		//Returns -1 as cannot find.
		System.out.println(stack.search(11));
		

	}

}
