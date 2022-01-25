package com.example.sfgdi.controller;

import com.example.sfgdi.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController  controller;
    @BeforeEach
    void setUp() {
        controller= new SetterInjectedController();
        controller.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}