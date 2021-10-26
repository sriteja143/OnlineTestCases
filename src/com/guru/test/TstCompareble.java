package com.guru.test;

import java.util.ArrayList;
import java.util.Collections;

public class TstCompareble implements Comparable<TstCompareble>{
	public int sno;
	
	public TstCompareble(int sno) {
		super();
		this.sno = sno;
	}

	public static void main(String[] args) {
		
		TstCompareble t1 = new TstCompareble(1);
		TstCompareble t2 = new TstCompareble(4);
		TstCompareble t3 = new TstCompareble(2);
		TstCompareble t4 = new TstCompareble(3);

		ArrayList<TstCompareble> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		list.stream().forEach(x-> System.out.println(x.sno));
		Collections.sort(list);    
		list.stream().forEach(x-> System.out.println(x.sno));

	}

	@Override
	public int compareTo(TstCompareble o) {
		if(sno > o.sno)
		return 1;
		else if(sno < o.sno)
		return -1;
		return 0;
	}

}
