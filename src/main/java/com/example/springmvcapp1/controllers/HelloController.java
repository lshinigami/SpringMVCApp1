package com.example.springmvcapp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name, @RequestParam("surname") String surname) {

        System.out.println("Hello, " + name + " " + surname);
        return "hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "goodbye";
    }
}
