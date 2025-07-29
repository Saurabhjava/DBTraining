package com.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger log= LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/logs")
    public String sayHello() {
        log.info("Hello Spring Boot ");
        log.error("Error Message ");
        log.debug("Debug Message");
        log.warn("Warn Message ");
        return "check your Logs";
    }
}
