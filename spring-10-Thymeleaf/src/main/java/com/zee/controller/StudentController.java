package com.zee.controller;

import com.zee.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    //    @RequestMapping(value = "/register",method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";

    }

    @RequestMapping(value = "/welcome",method = RequestMethod.POST) //localhost:8080/student/welcome?name=Ozzy
    @PostMapping("/welcome")
    public String welcome(@RequestParam String name){

        return "student/welcome";
    }

}
