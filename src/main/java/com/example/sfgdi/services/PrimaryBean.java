package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryBean implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World --From Primary";
    }
}