package com.example.demo.controller;

import com.example.demo.service.PrintMsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @Autowired
    PrintMsg printMsg; 

    @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    public String helloWorld(){
        String string= printMsg.printHello(); //invoking service method here
        return "hello world from shubham jaiswal"+string;
    }
    @RequestMapping(method=RequestMethod.GET, path="/about")
    public String about(){
        return "Myself Shubham Jaiswal, I am a b.tech graduate , speciallised in CSE";
    }
}