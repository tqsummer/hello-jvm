package com.study.hello.jvm.basic.lock;

/**
 * @Author: fangxiangqian
 * @Date: 2022/9/22
 */
public class DeadLoopTest {
    public static void doSomething() {
        int a = 1 + 2;
    }

    public static void main(String[] args) {
        while (true) {
            doSomething();
        }
    }
}
