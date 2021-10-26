package com.guru.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GFG {
	
	static class MySort implements Comparator{

		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	// driver code
	public static void main(String[] args) {
		
		
		String[] cities  = {"Banglore","Pune","San Farncisco","New York City"};
		MySort my = new MySort();
		Arrays.sort(cities,my);
		System.out.println(Arrays.binarySearch(cities, "New York City"));
		
		
		
		
		

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int i, j, flag;
		int a = 0;
		int b = 0;
		initilzeVariable.a = 0;
		initilzeVariable.b = 0;
		getintilize1(a, b, length);
		int largePrime = 0;
		for (i = initilzeVariable.a; i <= initilzeVariable.b; i++) {
			System.out.println("-----" + a);
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					;
				}
			}

			if (flag == 1) {
				System.out.println(i);
				largePrime = i;
			}

		}
		System.out.println(a + "" + b);
		System.out.println("large prime " + largePrime);
	}

	private static void getintilize1(int a, int b, int length) {
		if (length == 1) {
			initilzeVariable.a = 1;
			b = 9;
		} else if (length == 2) {
			initilzeVariable.a = 10;
			initilzeVariable.b = 99;
		} else if (length == 3) {
			initilzeVariable.a = 100;
			initilzeVariable.b = 999;
		} else if (length == 4) {
			initilzeVariable.a = 1000;
			initilzeVariable.b = 9999;
		} else if (length == 5) {
			initilzeVariable.a = 10000;
			initilzeVariable.b = 99999;
		} else if (length == 6) {
			initilzeVariable.a = 100000;
			initilzeVariable.b = 999999;
		} else if (length == 7) {
			initilzeVariable.a = 1000000;
			initilzeVariable.b = 9999999;
		} else if (length == 8) {
			initilzeVariable.a = 10000000;
			initilzeVariable.b = 99999999;
		} else if (length == 9) {
			initilzeVariable.a = 100000000;
			initilzeVariable.b = 999999999;
		} else if (length == 10) {
			initilzeVariable.a = 1000000000;
			initilzeVariable.b = 2147483647;
		}

		System.out.println("a" + a + "b" + b);
	}
}

class initilzeVariable {
	public static int a;
	public static int b;
}