package com.guru.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TreeSet;

public class StudentSort {

	public static void main(String[] args) throws SQLException {
		
	//DriverManager.getConnection("");
		
	Student s1   = new Student(1, "guru");
	Student s2   = new Student(3, "aaa");
	Student s3   = new Student(2, "hhhh");

	TreeSet<Student> set = new TreeSet<>();
	set.add(s1);
	set.add(s2);
	set.add(s3);
	
	//Collections.sort(set);
	set.stream().forEach(x -> System.out.println(x.id  + x.name ));
	
	
	TreeSet<String> set1 = new TreeSet<>();
	set1.add("s1");
	set1.add("s2");
	set1.add("s3");
	set1.stream().forEach(x -> System.out.println(x));
	}

}
