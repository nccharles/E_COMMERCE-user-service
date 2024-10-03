package com.amalitech.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class HomeController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "Welcome to Intermediate Lab3";
    }
}
