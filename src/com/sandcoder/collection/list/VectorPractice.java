package com.sandcoder.collection.list;

import java.util.Iterator;
import java.util.Vector;
//Dynamic Array, threadsafe
public class VectorPractice {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		
		Iterator<Integer> iterator = vec.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("The current capacity of the vector is: "+ vec.capacity());

		//Vector specific methods:
		System.out.println("The first element of the vector: "+ vec.firstElement());
		System.out.println("The last element entered was: "+ vec.lastElement());

		//Adding additional elements using for loop
		for(int i=vec.lastElement();i<vec.capacity();i++) {
			vec.add(i);
		}
		
		for(int i: vec)
			System.out.println(vec.get(i));
		
		System.out.println("The current capacity of the vector is: "+ vec.capacity());
		
		vec.add(10);
		//Increments the capacity by 10
		System.out.println("The capacity of the vector after add is: "+ vec.capacity());
		
		vec.removeAllElements();
		//Size changes to zero, but capacity stays same
		System.out.println("The capacity of the vector after remove is: "+ vec.capacity());
		
		
	}

}
