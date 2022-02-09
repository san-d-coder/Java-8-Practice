package com.sandcoder.env;

public class EnvPractice {

	public static void main(String[] args) {
		System.getenv().forEach((K,V)->System.out.println("Key:"+K+" | Value:"+V));
	}

}
