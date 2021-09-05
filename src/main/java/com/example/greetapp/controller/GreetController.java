package com.example.greetapp.controller;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class GreetController {

    @GetMapping("/")
    public String greet() {
        return "Hello, World!!";
    }

    @GetMapping("/welcome/{user-id}")
    public String greet(@PathVariable("user-id") @NonNull String user) {
        return "Welcome " + user.toUpperCase() + " to this new world!!";
    }
}
