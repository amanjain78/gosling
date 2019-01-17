package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GitController {

    @Autowired
    private GitProperties gitProperties;


    /*
    * This api is used to output git properties.
    * This information is being provided to the spring boot application
    * through a maven plugin which generates a git properties file
    * and the same file is available for Spring Boot Application.
    *
    * */
    @GetMapping("/gitInfo")
    public Map<String,String> getGitInfo(){
        Map<String,String> map = new HashMap<>();
        map.put("branch",gitProperties.getBranch());
        map.put("commitId",gitProperties.getCommitId());
        map.put("commitTime",gitProperties.getCommitTime().toString());
        return map;
    }
}
