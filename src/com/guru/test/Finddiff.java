package com.guru.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Finddiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String input = "558832";

		Map<Integer, Integer> map = new HashMap<>();
		String[] arr = input.split("");
		//String[] arr = sc.nextLine().split("");
		for (int i = 0; i < arr.length; i++) {
			Integer val = Integer.valueOf(arr[i]);
			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val,  1);
			}
		}
		
		//max occuence
		int max = Integer.MIN_VALUE; 
		Stream<Integer> vals =  map.entrySet().stream().map(x->x.getValue()).sorted();
		vals.forEach(System.out::println);
		/*for (Entry<Integer, Integer> entry : vals) {
			System.out.println(entry.getKey()+"_>"+ entry.getValue());
		}*/
	}

}
