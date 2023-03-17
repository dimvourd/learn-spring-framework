package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messagesender")
public class MessageSender {

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;
    @Autowired
    private SMSService smsService;
//    MessageSender(@Qualifier("emailService") MessageService messageService){
//        this.messageService = messageService;
//    }
//    @Autowired
//    MessageSender(@Qualifier("emailService") MessageService messageService, SMSService smsService){
//        this.messageService = messageService;
//        this.smsService = smsService;
//    }

//    @Autowired
//    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("setter 1 ");
//    }
//
//    @Autowired
//    public void setSmsService(SMSService smsService) {
//        this.smsService = smsService;
//        System.out.println("setter 2");
//    }

    public void sentMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message );
    }

}
