package com.poly.lab2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.lab2.bean.Student;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller
public class HomeController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @Autowired
    ServletContext context;

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
    @GetMapping("/lab2/demo3/scope")
    public String demo3Index(Model model) {
        model.addAttribute("a", "I am a Model");
        request.setAttribute("b","I am in Request Scope");
        session.setAttribute("c","I am in Session Scope");
        context.setAttribute("d", "I am in Application Scope");
        return "lab2/demo3_1";
    }

}
