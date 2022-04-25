package com.zemoso.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String greeting(){
        return "Hello World "+ LocalDateTime.now();
    }

    @GetMapping("/test")
    public String testDevTools(){
        return "Dev tools has started";
    }
    @GetMapping("/names")
    public String returnNames(){

        return "Coach: "+coachName+" of Team :  "+teamName;

    }



}
