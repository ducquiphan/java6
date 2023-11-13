package com.poly.lab1.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import com.nimbusds.oauth2.sdk.assertions.saml2.SAML2AssertionDetailsVerifier;
import com.poly.lab1.bean.Student;

public class StreamAPI {
	static List<Student> list = Arrays.asList(new Student("Phan Qui Duc", true, 7.5), new Student("Lucy", false, 7.0),
			new Student("Micheal Bay", true, 7.5), new Student("Phan Quy Duc", false, 1.5),
			new Student("Andy Lin", true, 8.5));

	public static void main(String[] args) {
//		demo1();
//		demo2();
		demo3();
		demo4();
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(1, 9, 4, 7, 5, 2);
		stream.forEach(System.out::println);

		List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
		list.stream().forEach(System.out::println);
	}

	private static void demo2() {
		List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
		List<Double> result = list.stream() // Stream<Integer>
				.filter(n -> n % 2 == 0) // Stream<Integer>
				.map(Math::sqrt) // Stream<Integer>
				.peek(System.out::println) // Stream<Integer> role as for
				.toList(); // List<Double>
	}

	private static void demo3() {
		List<Student> result = list.stream().filter(s -> s.getMark() >= 5)
				.peek(s -> s.setName(s.getName().toUpperCase())).toList();

		result.forEach(s -> {
			System.out.println("Full name: " + s.getName());
			System.out.println("Mark: " + s.getName());
			System.out.println();
		});
	}

	private static void demo4() {
		double average = list.stream().mapToDouble(s -> s.getMark()).average().getAsDouble();
		System.out.println("Average mark: " + average);

		double sum = list.stream().mapToDouble(s -> s.getMark()).sum();
		System.out.println("Sum mark: " + sum);

		double minMark = list.stream().mapToDouble(s -> s.getMark()).min().orElse(0.0);
		System.out.println("Min mark: " + minMark);

		double maxMark = list.stream().mapToDouble(s -> s.getMark()).min().orElse(0.0);
		System.out.println("Max mark: " + maxMark);

		boolean allPassed = list.stream().allMatch(s -> s.getMark() >= 5);
		System.out.println("All passed: " + allPassed);

		Student minStudent = list.stream().reduce(list.get(0), (min, s) -> s.getMark() < min.getMark() ? s : min);
		System.out.println("Min student: " + minStudent.getName());
	}
}
