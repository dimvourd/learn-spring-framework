package com.spring.core.assgnment1.javaconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.assgnment1.javaconfig")
public class AppConfig {
    @Bean
    MySQLDataSource mySQLDataSource(){
        return new MySQLDataSource();
    }
    @Bean
    PostgreSQLDataSource postgreSQLDataSource(){
        return new PostgreSQLDataSource();
    }
    @Bean
    EmailService emailService(){
        return new EmailService(postgreSQLDataSource());
    }
}
