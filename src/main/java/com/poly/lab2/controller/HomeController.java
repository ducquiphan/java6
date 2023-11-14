package com.poly.lab2.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.lab2.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/lab2/demo1")
    public String demo1(Model model) {
        model.addAttribute("message", "FPT <b>Polytechnic</b>");
        return "lab2/demo1";
    }

    @GetMapping("/lab2/demo2/index")
    public String demo2Index(Model model) throws Exception {
        model.addAttribute("message", "Welcome to Thymeleaf");

        ObjectMapper mapper = new ObjectMapper();
        String path = "src/main/resources/lab2/student.json";
        Student student = mapper.readValue(new File(path), Student.class);

        model.addAttribute("student", student);
        return "lab2/demo2";
    }
    @GetMapping("/lab2/demo2/about")
    public String demo2About(Model model) throws Exception {
        model.addAttribute("message", "This is About Us");
        return "lab2/demo2";
    }
    @GetMapping("/lab2/demo2/contact")
    public String demo2Contact(Model model) throws Exception {
        model.addAttribute("message", "This is Contact Us");
        return "lab2/demo2";
    }
    @GetMapping("/lab2/demo2/feedback")
    public String demo2Feedback(Model model) throws Exception {
        model.addAttribute("message", "This is Feedback");
        return "lab2/demo2";
    }

}
