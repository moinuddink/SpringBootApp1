package com.tshaped.SpringBootApp1.service;

import org.springframework.stereotype.Service;

@Service
public class Greeting {

    static
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Java Block");
    }

    public Greeting() {
        System.out.println("Greeting Bean Created  -->Constructor");
    }

    public String generateWish()
    {
        return "Good Morning";
    }
}
