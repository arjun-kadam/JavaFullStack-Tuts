package com.springcore.contructorInjection;

public class CIAmbiguity {
    private int a;
    private int b;
    CIAmbiguity(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Used by Int");
        System.out.println("Addition is "+(this.a+this.b));
    }
    CIAmbiguity(String a, String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Used by String");
        System.out.println("Addition is "+(this.a+this.b));
    }
    CIAmbiguity(float a,float b){
        this.a= (int) a;
        this.b=(int)b;
        System.out.println("Used by Float");
        System.out.println("Addition is "+(this.a+this.b));
    }
}
