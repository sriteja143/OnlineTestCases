package com.guru.test;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
	public int id;
	public String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (id > o.id)
			return 1;
		else if (id < o.id)
			return -1;
		return 0;
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.id > o2.id)
			return 1;
		else if (o1.id < o2.id)
			return -1;
		return 0;
	}

}
