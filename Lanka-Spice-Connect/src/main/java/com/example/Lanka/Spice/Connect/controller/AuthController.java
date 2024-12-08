package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.request.RequestUserLoginDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/v1")
public class AuthController {

    @PostMapping ("/login")
    public String login (@RequestBody RequestUserLoginDto requestUserLoginDto){
        System.out.println(requestUserLoginDto.getEmail());
        return "Login";
    }

    @PostMapping ("/register")
    public String register (@RequestBody RequestUserLoginDto requestUserLoginDto){
        System.out.println(requestUserLoginDto.getEmail());
        return "Register";
    }
}
