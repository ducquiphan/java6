package com.poly.lab2.bean;

import com.poly.lab2.bean.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    String name;
    Boolean gender = false;
    Double mark = 0.0;
    Contact contact;
    List<String> subjects;
}
