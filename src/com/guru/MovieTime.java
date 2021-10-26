package com.guru;

import java.util.concurrent.Callable;

public class MovieTime implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return "FREE TIME";
	}

}
