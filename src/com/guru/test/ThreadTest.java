package com.guru.test;

public class ThreadTest {

	public static void main(String[] args) {
	Thread t1  = new Thread();
	t1.start();
	t1.stop();
	System.out.println(t1.isAlive());;
	System.out.println(t1.isInterrupted());;
	
    Object ob  = new Object();
    System.out.println(ob.getClass());;
    ob.notify();
	}

}
