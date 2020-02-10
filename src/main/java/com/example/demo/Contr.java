package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contr {

    @GetMapping("/hello")
    public String handler(){

        return "hello.html";
    }
}
