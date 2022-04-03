package com.mainapp.mo2.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("hello from: "+getClass().getName());
        return "Hello";
    }
}
