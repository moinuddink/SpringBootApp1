package com.tshaped.SpringBootApp1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class TimeConfig {
    public TimeConfig() {
        System.out.println("TimeConfig bean created");
    }

    @Bean
    public LocalTime createTimeInstance()
    {
        LocalTime time = LocalTime.now();
        return time;
    }
}
