package com.study.hello.jvm.basic.loader;

public class InitClass {
    public static void main(String[] args) {
        InitClass initClass = new InitClass();
        initClass.m1();
    }

    public void m1(){
        System.out.println(SuperClass.str);
    }
}
