package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Welcome {
    @GetMapping("/hi")
    public String getMessage(){return "welcome to cicd";}
}
