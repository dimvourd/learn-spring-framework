package com.spring.core.assgnment1.javaconfig;

import com.spring.core.assgnment1.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService {

    // Next create email service as a business class that will basically send an email to a list of email IDs
    // next to inject this data source in our email service class and then create send email method.
    private com.spring.core.assgnment1.DataSource dataSource;
    private String[] IDs;
    public EmailService ( DataSource dataSource){ this.dataSource = dataSource; }

    public void sendEmail(){
        IDs = dataSource.getEmails();
        for(String id: IDs) System.out.println("Email id: "+id);
    }
}
