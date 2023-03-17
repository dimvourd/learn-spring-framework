package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("traveler") // bean id
public class Traveler {
    private Vehicle vehicle;

    @Autowired
    public Traveler(@Qualifier("bike") Vehicle vehicle){
        this.vehicle= vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }
}