package com.db;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hi")
    public String m1() {
        return "Spring Admin server Example";
    }
}
