package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void SetUp(){
        controller =new ConstructorInjectedController(new ConstructorGreetingServiceImpl());

    }
    @Test
    void shouldReturnHelloWorld(){
//        assertEquals(controller.getGreetingService().sayGreeting(),"Hello world");
        System.out.println(controller.getGreetingService().sayGreeting());

    }

}