package com.example.springrestapipostgre.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestControllers {

    @GetMapping("test")
    public String test() {
        return "Test masuk";
    }
}
