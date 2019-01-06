package com.example.controllers;

import com.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class WelcomeController {

    @Autowired
    private TestService testService;

    //This will return sample template(jsp/html) present in the claasspath:/templates with the name sample
    @RequestMapping(value = "/sample")
    public String welcome(){
        return "sample";
    }

    @RequestMapping(value = "/")
    public String home() { return "home" ;}

    @RequestMapping(value = "/asynctest")
    public String  asyncTest(){
        log.info("M1"+Thread.currentThread().getName());

        testService.test();
        log.info("M1"+Thread.currentThread().getName());

        return "sample";
    }


}
