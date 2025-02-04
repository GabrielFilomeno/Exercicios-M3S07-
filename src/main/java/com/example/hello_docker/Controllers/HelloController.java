package com.example.hello_docker.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String helloWorld() {

        log.info("GET /hello");
        return "Hello World";
    }
}
