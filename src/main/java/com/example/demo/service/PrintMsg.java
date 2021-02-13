package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PrintMsg {
    // public PrintMsg(){
    //     System.out.println("*****************inside service layer*************");
    // }
    public String printHello(){
        System.out.println("hello from service layer");
        return " inside service layer ";
    }
}
