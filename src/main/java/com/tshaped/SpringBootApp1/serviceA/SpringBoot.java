package com.tshaped.SpringBootApp1.serviceA;

import org.springframework.stereotype.Service;

@Service("springBoot")
public class SpringBoot implements ICourse {

    public SpringBoot() {
        System.out.println("Spring Boot Bean is created");
    }

    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Spring boot Course is Purchased successfully and fees paid is " + price);
        return true;
    }
}
