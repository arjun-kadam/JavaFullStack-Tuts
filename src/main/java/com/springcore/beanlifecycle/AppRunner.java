package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beanlifecycle.xml");
        context.registerShutdownHook();
        UsingSpringInterface c1=context.getBean("connection2",UsingSpringInterface.class);

    }
}
