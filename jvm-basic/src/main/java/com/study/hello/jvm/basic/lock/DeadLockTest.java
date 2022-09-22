package com.study.hello.jvm.basic.lock;

/**
 * @Author: fangxiangqian
 * @Date: 2022/9/22
 */
public class DeadLockTest {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        new Thread(()->{
            synchronized (lock1){
                System.out.println("thread 1 get lock1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("thread 1 get lock2");
                }
            }

        }).start();

        new Thread(()->{
            synchronized (lock2){
                System.out.println("thread 2 get lock2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("thread 2 get lock1");
                }

            }

        }).start();
    }
}
