package com.guru;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultieThreding2 {

	public static void main(String[] args) {
		/*
		
		ExecutorService ser = Executors.newFixedThreadPool(10);
		System.out.println(Thread.currentThread().getName());
		try {
			Future<Integer> future = ser.submit(new RunClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	*/
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
