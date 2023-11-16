package com.poly.lab2.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.lab2.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/lab2/demo3")
public class StudentController {
    @RequestMapping("/student")
    public String index(Model model,
                        @RequestParam(name ="index", defaultValue = "0") Integer index) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Student>> type = new TypeReference<List<Student>>(){};
        File path = ResourceUtils.getFile("src/main/resources/lab2/students.json");
        List<Student> students = mapper.readValue(path,type);

        int i = index;
        Student student = students.get(i);
        model.addAttribute("student", student);
        model.addAttribute("i", i >= students.size() - 1 ? -1 : i);
        return "lab2/demo3_2";

    }

}
