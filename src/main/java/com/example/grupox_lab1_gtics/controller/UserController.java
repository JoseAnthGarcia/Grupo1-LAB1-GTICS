package com.example.grupox_lab1_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/newUser")
    public String addUser(){
        return "newUser";
    }
}
