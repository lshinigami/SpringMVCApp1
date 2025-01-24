package com.example.springmvcapp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam double a, @RequestParam double b, @RequestParam String action, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);

        switch (action) {
            case "add":
                model.addAttribute("answer", a + b);
                break;
            case "substruct":
                model.addAttribute("answer", a - b);
                break;
            case "mult":
                model.addAttribute("answer", a * b);
                break;
            case "divide":
                if(b != 0) {
                    model.addAttribute("answer", a / b);
                }
                else {
                    model.addAttribute("answer", "do not divide by zero");
                }
                break;
        }
        return "calculator";
    }
}
