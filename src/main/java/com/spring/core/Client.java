package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        // Creating spring IoC container
        // Read's the configuration class
        // Create and manage the Spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        // retrieve srping beans from Spring IoC container

        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();
    }
}
