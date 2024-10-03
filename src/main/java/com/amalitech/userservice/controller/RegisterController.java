package com.amalitech.userservice.controller;

import com.amalitech.userservice.model.Users;
import com.amalitech.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class RegisterController {
    @Autowired
    private UsersService jwtUserDetailsService;

    @PostMapping("/register")
    public Users registerUser (@RequestBody Users user){
        return jwtUserDetailsService.save(user);
    }
}
