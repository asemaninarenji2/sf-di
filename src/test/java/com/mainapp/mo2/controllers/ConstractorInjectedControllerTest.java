package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstractorInjectedControllerTest {
    ConstractorInjectedController controller;
    @BeforeEach
    void SetUp(){
        controller =new ConstractorInjectedController(new GreetingServiceImpl());

    }
    @Test
    void shouldReturnHelloWorld(){
//        assertEquals(controller.getGreetingService().sayGreeting(),"Hello world");
        System.out.println(controller.getGreetingService().sayGreeting());

    }

}