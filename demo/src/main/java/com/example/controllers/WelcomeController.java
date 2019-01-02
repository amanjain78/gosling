package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    //This will return sample template(jsp/html) present in the claasspath:/templates with the name sample
    @RequestMapping(value = "/sample")
    public String welcome(){
        return "sample";
    }


}
