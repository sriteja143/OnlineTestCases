package com.guru;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		String[] arr = new String[]{"guru","tja"};
		java.util.List<String> li = Arrays.asList(arr);
		System.out.println(li);
	}
}
