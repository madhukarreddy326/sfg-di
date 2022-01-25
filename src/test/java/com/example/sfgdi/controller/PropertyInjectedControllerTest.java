package com.example.sfgdi.controller;

import com.example.sfgdi.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService= new PropertyGreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}