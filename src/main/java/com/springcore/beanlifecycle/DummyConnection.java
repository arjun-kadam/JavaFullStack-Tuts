package com.springcore.beanlifecycle;

public class DummyConnection {
    private String success;
    DummyConnection(String input){
        this.success=input;
    }
    public void setConnection(){
        System.out.println("Connecting To New Network");
    }
    public void closeConnection(){
        System.out.println("Closing Connection");
    }

    @Override
    public String toString() {
        return "DummyConnection{" +
                "success='" + success + '\'' +
                '}';
    }
}
