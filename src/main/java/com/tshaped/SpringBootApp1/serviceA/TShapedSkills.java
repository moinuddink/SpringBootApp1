package com.tshaped.SpringBootApp1.serviceA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TShapedSkills {


   /* @Autowired
    @Qualifier("java")*/
    private ICourse iCourse;


    /*
    * @Qualifier Cann't be applied to constructor
    * at the parameter level you can apply @
    * public TShapedSkills( @Qualifier("java")ICourse iCourse)
    * */
    public TShapedSkills( @Qualifier("springBoot")ICourse iCourse) {
        super();
        System.out.println("Dependency Injection Through Constructor");
        this.iCourse = iCourse;
    }

    public TShapedSkills() {
        System.out.println("TShapedSkills skills bean is created");
    }

    @Autowired
    //@Qualifier("java")-->for java object
    @Qualifier("springBoot")
    public void setiCourse(ICourse iCourse) {//ICourse iCourse = new Java();
        System.out.println("Setter is called for setter injection");
        this.iCourse = iCourse;
    }

    public Boolean buyTheCourse(Double price) {

        return iCourse.getTheCourse(price);
    }
}
