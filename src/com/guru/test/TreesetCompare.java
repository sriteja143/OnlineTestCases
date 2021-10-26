package com.guru.test;

import java.util.TreeSet;

public class TreesetCompare implements Comparable<TreesetCompare>{
	public int sno;
	
	public TreesetCompare(int sno) {
		super();
		this.sno = sno;
	}

	public static void main(String[] args) {
		
		TreesetCompare t1 = new TreesetCompare(1);
		TreesetCompare t2 = new TreesetCompare(4);
		TreesetCompare t3 = new TreesetCompare(2);
		TreesetCompare t4 = new TreesetCompare(3);

		TreeSet<TreesetCompare> list = new TreeSet<TreesetCompare>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		list.stream().forEach(x-> System.out.println(x.sno));
		list.stream().forEach(x-> System.out.println(x.sno));

	}

	@Override
	public int compareTo(TreesetCompare o) {
		if(sno > o.sno)
			return 1;
			else if(sno < o.sno)
			return -1;
			return 0;
	}

}
