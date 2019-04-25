package com.example.controllers;

import com.example.model.User;
import com.example.repository.master.UserMasterRepository;
import com.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class WelcomeController {

    @Autowired
    private TestService testService;

    @Autowired
    private UserMasterRepository userMasterRepository;

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

    @RequestMapping(value = "/createUser")
    public String createUser(@RequestParam(value = "name") String name){
        User user = new User();
//        user.setId(1);
//        user.setName(name);
//        testService.saveUser(user);
//    userMasterRepository.test1();
        testService.read();
    return "sample";
    }




}
