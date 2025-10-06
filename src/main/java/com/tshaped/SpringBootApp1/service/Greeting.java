package com.tshaped.SpringBootApp1.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void init()
    {
        System.out.println("Bean init Method ");
    }

    public String generateWish()
    {
        return "Good Morning";
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Bean Destroyed ");
    }
}
