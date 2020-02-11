package com.example.demo;


import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Contr {

    @GetMapping("/hello")
    public String handler(){

        return "hello.html";
    }





}
