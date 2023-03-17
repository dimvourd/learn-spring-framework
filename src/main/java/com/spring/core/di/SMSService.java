package com.spring.core.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("SMS: "+message);
    }
}
