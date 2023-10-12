package com.spring.Mservices.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/welcome")
    public String WelcomeController(){

        return "welcome";
    }
}
