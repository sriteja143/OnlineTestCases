package com.guru;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TicketOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ser = Executors.newFixedThreadPool(10);
		System.out.println(Thread.currentThread().getName());
		try {
			Future<String> moviename = ser.submit(new MovieName());
			System.out.println(moviename.get());
			Future<String> movietime = ser.submit(new MovieTime());
			System.out.println(movietime.get());
			Future<String> payment = ser.submit(new Payment());
			System.out.println(payment.get());
			Future<String> slot = ser.submit(new Slot());
			System.out.println(slot.get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ser.shutdown();
		System.out.println(ser.isTerminated());
		System.out.println(ser.isShutdown());
		System.out.println(Thread.currentThread().getName());
		
	}

}
