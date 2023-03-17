package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig{
    @Bean
    public Address address(){
        return new Address();
    }

    @Bean(name = {"studentBean","studentDemo"},initMethod = "init",destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }

}
class Address{
    public void print(){
        System.out.println("Address class");
    }
}

class Student{
    Address address;
    Student(Address address){
        this.address = new Address();
    }

    public void print(){
        System.out.println("Student class.. ");
        address.print();
    }
    public void init() {
        System.out.println("init ob student");
    }
    public void destroy(){
        System.out.println("destroy ob student");
    }

}
public class beanAnnotationDemo {
    public static void main(String[] args) {
        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            //Student student = applicationContext.getBean(Student.class);
            Student student = (Student) applicationContext.getBean("studentDemo");

            student.print();
            String[] beanNames = applicationContext.getBeanDefinitionNames();

            for (var bean : beanNames) System.out.println(bean);
        }
    }
}
