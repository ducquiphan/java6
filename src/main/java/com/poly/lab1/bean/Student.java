package com.poly.lab1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	String name;
	Boolean gender = false;
	Double mark = 0.0;
}
