package com.isha.prepare.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Value("${home.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "home";
    }

    @GetMapping("/hello")
    public String mainPageWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model){
        model.addAttribute("message", name);
        return "home";
    }
}
