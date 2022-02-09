package com.sandcoder.java8.practice;

import java.util.ArrayList;
import java.util.List;

public class ListDao {
	private List<Integer> list = null;

	public List<Integer> getIntegers() {
		return this.list;
	}

	public ListDao() {
		this.list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}

}
