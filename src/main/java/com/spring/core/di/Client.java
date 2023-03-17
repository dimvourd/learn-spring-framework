package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        MessageService smsService = new SMSService();
//        MessageSender mS = new MessageSender(smsService);
//        mS.sentMessage("Good Morning! ");
        String message = "Good Morning!";

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sentMessage(message);
    }


}
