package com.study.hello.jvm.basic.dispatch;

public class DynamicDispatch {

    public static void main(String[] args) {
        Human man = new Man();
        man.sayHello();
        Human woman = new Woman();
        woman.sayHello();
        man = new Woman();
        man.sayHello();

    }
}
