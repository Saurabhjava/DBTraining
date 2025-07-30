package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public @ResponseBody String sayHello() {
        return "Hello Spring MVC Example!";
    }

    @GetMapping("/hi")
    public String sayHello1() {
        System.out.println("SayHello1 method Called");
        return "Hello";
    }
}
