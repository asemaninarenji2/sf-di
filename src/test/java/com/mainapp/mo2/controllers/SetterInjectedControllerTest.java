package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController  controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl() );
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreetingService().sayGreeting());
    }
}