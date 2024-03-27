package com.zee.controller;

import com.zee.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register") //localhost:8080/student/register
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome") //localhost:8080/student/welcome?name=Ozzy
    public String welcome(){


        return "student/welcome";
    }
}
