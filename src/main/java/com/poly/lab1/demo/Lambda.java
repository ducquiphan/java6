package com.poly.lab1.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.poly.lab1.bean.Student;

public class Lambda {

	static List<Student> list = Arrays.asList(new Student("Phan Qui Duc", true, 7.5), new Student("Lucy", false, 7.0),
			new Student("Micheal Bay", true, 7.5), new Student("Phan Quy Duc", false, 9.5),
			new Student("Andy Lin", true, 8.5));

	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
	}

	private static void demo1() {
		List<Integer> list = Arrays.asList(1, 9, 4, 65, 2);
		list.forEach(n -> System.out.println(n));
	}

	private static void demo2() {
		list.forEach(student -> {
			System.out.println("Full name: " + student.getName());
			System.out.println("Marks: " + student.getMark());
			System.out.println();
		});
	}

	private static void demo3() {
		Collections.sort(list, (s1, s2) -> -s1.getMark().compareTo(s2.getMark()));
		list.forEach(student -> {
			System.out.println("Full name: " + student.getName());
			System.out.println("Marks: " + student.getMark());
			System.out.println();
		});
	}

	private static void demo4() {
		Demo4Interface o = (x) -> {
			System.out.println(x);
		};
		o.m1(12312);
	}
}

@FunctionalInterface
interface Demo4Interface {
	void m1(int x);

	default void m2() {
	}

	public static void m3() {
	}
}
