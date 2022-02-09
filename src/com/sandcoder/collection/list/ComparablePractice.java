package com.sandcoder.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(4, "Sandeep", 10, 5));
		list.add(new Student(2, "Rahul", 11, 6));
		list.add(new Student(1, "Sam", 7, 2));
		list.add(new Student(3, "Harry", 15, 10));

		System.out.println("Before sorting: ");

		for (Student student : list)
			System.out.println(student);

		// Collections.sort fails to handle unless we implement Comparable

		Collections.sort(list);

		// Printing the sorted list

		System.out.println("After Sorting");

		for (Student student : list)
			System.out.println(student);

	}

}

class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private int age;
	private int standard;

	public Student(int rollNo, String name, int age, int standard) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.standard = standard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getStandard() {
		return standard;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", standard=" + standard + "]";
	}

	// Sorting using Age
	@Override
	public int compareTo(Student student) {
		/*
		 * if (this.age > student.age) return 1; else if (this.age < student.age) return
		 * -1; else return 0;
		 */
		
		//Subtraction makes it simpler and faster:
		
		return this.age - student.age;
	}

}