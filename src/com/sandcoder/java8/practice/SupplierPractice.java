package com.sandcoder.java8.practice;

import java.util.function.Supplier;

// Return all days of the week
public class SupplierPractice {
	
	public static void main(String[] args) {
		Supplier<Double> supplier = ()->Math.random();
		System.out.println(supplier.get());
	}

}
