package com.springcore.contructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ciinjection.xml");
        CIAmbiguity c1=context.getBean("ambiguity",CIAmbiguity.class);
//        System.out.println(c1);

    }
}
