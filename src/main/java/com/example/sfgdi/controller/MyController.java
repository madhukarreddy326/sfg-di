package com.example.sfgdi.controller;

import com.example.sfgdi.services.PrimaryBean;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    PrimaryBean  primaryBean;

    public MyController(PrimaryBean primaryBean) {
        this.primaryBean = primaryBean;
    }

    public String sayHello()
    {
        System.out.println("Hello world!..");
        //return " Hi Folks";
        return primaryBean.sayGreeting();

    }
}
