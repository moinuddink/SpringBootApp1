package com.tshaped.SpringBootApp1;

import com.tshaped.SpringBootApp1.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
    ConfigurableApplicationContext container=	SpringApplication.run(SpringBootApp1Application.class, args);//Default springboot uses is applicationcontext


	Greeting greet	=container.getBean(Greeting.class);
		System.out.println(greet.generateWish());
//		int count = container.getBeanDefinitionCount();
//
//		System.out.println("Bean Count "+count);
	}

}
