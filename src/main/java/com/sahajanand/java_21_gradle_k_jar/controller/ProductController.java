package com.sahajanand.java_21_gradle_k_jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String hello() {
        return "js 555";
    }
}
