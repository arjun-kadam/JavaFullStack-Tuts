package com.springcore.contructorInjection;

public class Client {
    private String name;
    private String projectName;
    private int budget;
    Worker worker;
    public Client(String name,String projectName,int budget, Worker worker){
        this.name=name;
        this.projectName=projectName;
        this.budget=budget;
        this.worker=worker;
    }
    public String setName(String name){
        return this.name=name;
    }
    public String getName(){
        return this.name;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", projectName='" + projectName + '\'' +
                ", budget=" + budget +
                ", worker=" + worker +
                '}';
    }
}
