package com.springcore.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("refobj.xml");
        Student s1=context.getBean("student",Student.class);
        System.out.println(s1);
    }
}
