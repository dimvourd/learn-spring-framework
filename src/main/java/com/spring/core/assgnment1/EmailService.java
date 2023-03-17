package com.spring.core.assgnment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService {

    // Next create email service as a business class that will basically send an email to a list of email IDs
    // next to inject this data source in our email service class and then create send email method.
    private DataSource dataSource;
    private String[] IDs;
    @Autowired
    public EmailService (@Qualifier("postgreSQLDataSource") DataSource dataSource){ this.dataSource = dataSource; }

    public void sendEmail(){
        IDs = dataSource.getEmails();
        for(var id: IDs) System.out.println("Email id: "+id);
    }
}
