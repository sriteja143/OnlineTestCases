package com.guru.test;

public class SingletoneClass {
	
	private static SingletoneClass obj;

	public  static SingletoneClass getObj() {
		if(obj  == null)obj = new SingletoneClass();
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SingletoneClass.getObj());
		System.out.println(SingletoneClass.getObj());
		System.out.println(SingletoneClass.getObj().equals(SingletoneClass.getObj()));
		
	}

}
