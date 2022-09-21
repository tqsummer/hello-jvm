package com.study.hello.jvm.basic.classloader;

/**
 * @Author: fangxiangqian
 * @Date: 2022/5/24
 */
public class MyHelloClassLoader extends ClassLoader {
    private String classPath;

    public MyHelloClassLoader(String classPath) {
        this.classPath = classPath;
    }

    public static void main(String[] args) {
        String str = new String("123");
        System.out.println(str);
    }


}
