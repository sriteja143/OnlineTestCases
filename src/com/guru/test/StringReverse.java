package com.guru.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		//String input = "GURU TEJA";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		char[] stringCharArray = input.toCharArray();
		String reversedString = "";

		// iterating from last
		for (int i = stringCharArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + stringCharArray[i];
		}

		System.out.println(reversedString);
	}

}
