package com.guru;

public class PattrenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count  = 4;
		if(count < 1) {
			System.out.println("invalid  data");
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.println("*");
			}
		}
	}

}
