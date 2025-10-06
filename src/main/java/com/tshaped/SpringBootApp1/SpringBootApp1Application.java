package com.tshaped.SpringBootApp1;

import com.tshaped.SpringBootApp1.service.Greeting;
import com.tshaped.SpringBootApp1.serviceA.TShapedSkills;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
    ConfigurableApplicationContext container=	SpringApplication.run(SpringBootApp1Application.class, args);//Default springboot uses is applicationcontext

	TShapedSkills tShaped	= container.getBean(TShapedSkills.class);
   Boolean status =	  tShaped.buyTheCourse(444.25);

   if(status)
	   System.out.println("You have successfully purchase the course");
   else
	   System.out.println("You have failed to purchase the course");


	/*Greeting greet	=container.getBean(Greeting.class);
		System.out.println(greet.generateWish());*/
//		int count = container.getBeanDefinitionCount();
//
//		System.out.println("Bean Count "+count);
	}

}
