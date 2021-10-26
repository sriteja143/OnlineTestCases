package com.guru.test;

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String input = "558832";
		int sum = getSum(sc.nextLine());
		while(sum > 27) {
			sum = getSum(sum+"");
		}
		System.out.println((char)(64+sum));
		sc.close();
	}

	private static int getSum(String input) {
		String[] s = input.split("");
		int sum = Arrays.asList(s).stream().mapToInt(x->Integer.valueOf(x)).sum();
		return sum;
	}

}
