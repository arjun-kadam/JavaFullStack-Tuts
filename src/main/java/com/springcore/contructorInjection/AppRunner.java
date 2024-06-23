package com.springcore.contructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ciinjection.xml");
        Client c1=(Client) context.getBean("client1");
        System.out.println(c1);

    }
}
