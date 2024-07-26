package com.authsphere.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to AuthSphere";
    }
}
