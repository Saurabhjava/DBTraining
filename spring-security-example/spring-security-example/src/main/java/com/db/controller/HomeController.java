package com.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";  // public page
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";  // user page
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";  // admin page
    }

}
