package com.poly.lab1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 {
	String name;
	Boolean gender = false;
	Double mark = 0.0;

	Contact contact;

	List<String> subjects;
}
