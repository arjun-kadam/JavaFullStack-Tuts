package com.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingSpringInterface implements InitializingBean, DisposableBean {
    private String input;
    UsingSpringInterface(String input){
        this.input=input;
        System.out.println(input);
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Cleaning Data");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting Data");
    }
}
