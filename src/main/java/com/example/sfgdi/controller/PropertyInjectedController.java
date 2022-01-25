package com.example.sfgdi.controller;

import com.example.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }

}
