package com.tshaped.SpringBootApp1.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Greeting {

    @Autowired
    private LocalTime time;


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
        int hour = time.getHour();
        if(hour<12)
        {
            return "Good Morning";
        } else if (hour>=12 && hour<18) {
            return "Good Afternoon";

        }else if (hour>=18 && hour<24) {
            return "Good Evening";
        }
        return "Good Night";

    }
    @PreDestroy
    public void destroy()
    {
        LocalTime.now();
        System.out.println("Bean Destroyed ");
    }
}
