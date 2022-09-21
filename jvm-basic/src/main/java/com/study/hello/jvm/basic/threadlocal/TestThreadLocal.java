package com.study.hello.jvm.basic.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadLocal {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es2 = Executors.newFixedThreadPool(3);



        for(int i=0;i<100;i++){
            final int j = i;
            es2.submit(()->{
                ThreadLocal<A> threadLocal = new ThreadLocal<>();
                threadLocal.set(new A("fxq"+j));
                System.out.println(threadLocal.get()+","+Thread.currentThread());
            });
        }

        boolean stop =false;
        int i = 0;
        ThreadLocal<A> threadLocal = new ThreadLocal<>();
        while (!stop){
            Thread.sleep(1000);
            if(i++>2){
                System.gc();
                es2.submit(()->{
                    threadLocal.set(new A("fxq"+-1));
                    System.out.println(threadLocal.get()+","+Thread.currentThread()+threadLocal);
                });
            }

        }
        es2.shutdown();


    }
    static class A{
        private String name;
        public A(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
