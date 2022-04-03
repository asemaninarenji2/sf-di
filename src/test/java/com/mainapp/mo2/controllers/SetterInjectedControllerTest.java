package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController  controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl() );
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreetingService().sayGreeting());
    }
}