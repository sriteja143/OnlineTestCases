package com.guru;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arr  = new String[] {"66" ,"77" , "88" ,"99"};
		
		int rotation = 2;
		
		String[] arr = "66 77 88 99".split(" ");
		
		for (int i = 0; i < rotation; i++) {
			String last = arr[0];
			for (int j = arr.length-1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
