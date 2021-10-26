package com.guru;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(6000);
		System.out.println("sleep done");
		return new Random().nextInt();
	}


}
