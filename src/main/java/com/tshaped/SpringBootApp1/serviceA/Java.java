package com.tshaped.SpringBootApp1.serviceA;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("java") //j is the beanId
@Primary
public class Java implements ICourse {

    public Java() {
        System.out.println("Java Bean Created");
    }

    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Java Course is Purchased successfully and fees paid is " + price);
        return true;
    }
}
