package com.guru.test;

public class WhichOneFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "aaa";
		String input = "b";
		//String input = "abba";
		//String input = "ba";
		//String input = "aabb";
		System.out.println(getSolution(input));
	}

	private static boolean getSolution(String input) {
		if((input.contains("a")&& !input.contains("b"))|| (input.contains("b")&& !input.contains("a"))) {return true;}
		if(input.lastIndexOf("a") < input.lastIndexOf("b")) {
			return true;
		}
		return false;
	}

}
