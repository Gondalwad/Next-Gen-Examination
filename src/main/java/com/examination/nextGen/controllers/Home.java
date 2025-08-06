package com.examination.nextGen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @GetMapping({"/","home"})
    @ResponseBody
    public String home(){
        System.out.println("Home Page");
        return "Home Page";
    }
}
