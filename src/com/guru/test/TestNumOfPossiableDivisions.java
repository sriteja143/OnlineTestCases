package com.guru.test;

import java.util.Scanner;

public class TestNumOfPossiableDivisions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numOfInput  = sc.nextInt();
		int[] arr = new int[numOfInput];
		for (int i = 0; i < numOfInput; i++) {
			arr[i] = sc.nextInt();
			System.out.println("inserted value -> "+arr[i] );
		}
		getPrint(arr);
		
		System.out.println("enter num to remove form input ");
	    int 	numToremove = sc.nextInt();
	    
	    int total = 0;
	    boolean falg = true;
		for (int i = 0; i < arr.length; i++) {
			if (falg && numToremove == arr[i]) {
				arr[i] = 0;
				falg = false;
			}
			total = total + arr[i];
		}
		
		getPrint(arr);
		System.out.println(total);
		
		System.out.println("RESPONSE");
		if(total/numOfInput > 0)
			System.out.println(total/numOfInput);
		else
			System.out.println("-1");
		
	}

	private static void getPrint(int[] arr) {
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
