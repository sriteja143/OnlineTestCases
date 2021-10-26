package com.guru;

import java.util.Random;

public class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		//return new Random().nextInt();
	}

}
