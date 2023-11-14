package com.poly.lab1.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.lab1.bean.Contact;
import com.poly.lab1.bean.Student2;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Jackson2 {
    public static void main(String[] args) {
        try {
            demo7();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void demo7() throws Exception {
        Contact contact = new Contact("phanquiduc@gmail.com", "0703032483", "Ho Chi Minh");
        List<String> subjects = Arrays.asList("WEB205", "COM108");
        Student2 student = new Student2("Phan Qui Duc", true, 10.0, contact, subjects);

        ObjectMapper mapper = new ObjectMapper();
        // Write to String
        String json = mapper.writeValueAsString(student);
        // Write to output
        mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, student);
        // Write to file
        mapper.writeValue(new File("C:\\Users\\Admin\\IdeaProjects\\java6\\src\\main\\resources\\lab1\\student.json"), student);
    }
}
