package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value="/hello")
    public String hello() {
        return "Hello, World! From the backend";
    }
}
