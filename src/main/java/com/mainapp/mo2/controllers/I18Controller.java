package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    private final GreetingService greetingService;

    public I18Controller(@Qualifier("i18GreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
