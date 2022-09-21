package com.study.hello.jvm.basic.loader;

public class SuperClass {
    static {
        System.out.println("SuperClass init");
    }

    public static int value = 123;
    public static final String str = "fxq";
    public static final int VALUE_REF = value;

    public void sayHello(){
        System.out.println("Super sayHello");
    }
}
