package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingService;
import org.springframework.stereotype.Controller;

import javax.sound.midi.Soundbank;

@Controller
public class MyController {
   private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
        System.out.println("--------Primary Annotated Bean");
        System.out.println(greetingService.sayGreeting());
        System.out.println("-----------------------------");

    }
}
