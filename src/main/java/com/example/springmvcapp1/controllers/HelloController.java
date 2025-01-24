package com.example.springmvcapp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(required = false) String name , @RequestParam(required = false) String surname,
                            Model model) {

        //System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "goodbye";
    }
}
