package com.poly.lab1.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Jackson1 {
    public static void main(String[] args) {
        try {
            demo1();
        } catch (Exception e) {

        }
    }

    private static void demo1() throws Exception {
        String path = "C:\\Users\\Admin\\IdeaProjects\\java6\\src\\main\\resources\\lab1\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode students = mapper.readTree(new File(path));
        students.iterator().forEachRemaining(student -> {
            System.out.println("Name: " + student.get("name").asText());
        });
    }
}
