package com.guru;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultieThreding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ser = Executors.newFixedThreadPool(10);
		System.out.println(Thread.currentThread().getName());
		try {
			Future<Integer> future = ser.submit(new Task());
			System.out.println("future.get() -> " + future.get());;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ser.shutdown();
		System.out.println(ser.isTerminated());
		System.out.println(ser.isShutdown());
		System.out.println(Thread.currentThread().getName());
		
	}

}
