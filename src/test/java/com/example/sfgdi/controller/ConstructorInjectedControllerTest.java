package com.example.sfgdi.controller;

import com.example.sfgdi.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ConstructorInjectedController(new PropertyGreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}