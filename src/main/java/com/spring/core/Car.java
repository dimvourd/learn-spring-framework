package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("car")
public class Car implements Vehicle{
    @Override
    public void move(){
        System.out.println("car is moving...");
    }
}
