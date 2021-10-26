package com.guru.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDiskAndPickHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(1);
		///list.add(2);
		
		list.stream().forEach(System.out::println);
		
		int segment = 2;
		int size = 5;
		getSolution(segment,size,list);
		System.out.println("-----" + getSolution(segment,size,list));
	}

	private static int getSolution(int segment, int size, List list) {
		
		// get sub list
		List minlist = new ArrayList<>();
		for (int i = 0; i < size - segment+1; i++) {
			System.out.println("==============");
			//minlist.add(list.stream().mapToInt().min();
			minlist.add(list.subList(i, i+segment).stream().sorted().min(Comparator.naturalOrder()).get());
			//list.subList(i, i+segment).stream().forEach(System.out::println);;
		}
		//System.out.println("========min list======");
		//minlist.stream().forEach(System.out::println);
		//return (int) minlist.stream().sorted().max(Comparator.naturalOrder()).get();
		return (int) minlist.stream().sorted().max(Comparator.naturalOrder()).get();
	}

}
