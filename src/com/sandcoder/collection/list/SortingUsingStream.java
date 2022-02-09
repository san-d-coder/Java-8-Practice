package com.sandcoder.collection.list;

import java.util.ArrayList;
import java.util.List;

public class SortingUsingStream {

	public static void main(String[] args) {
		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile("Apple",4,59999,3));
		mobiles.add(new Mobile("Samsung",16,79999,5));
		mobiles.add(new Mobile("Redmi",12,12000,5));
		mobiles.add(new Mobile("Jio",2,2000,2));
		
		System.out.println("Before Sorting: ");
		for (Mobile mobile : mobiles)
			System.out.println(mobile);
		
		//Sorting using Stream:
		System.out.println("After Sorting");
		mobiles.stream().sorted((m1,m2)->m2.getRam()-m1.getRam())
			.forEach(System.out::println);

	}

}
