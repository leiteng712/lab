package com.example.jvm.classloader;

/**
 * 几种获取classloader的方式
 */
public class ClassLoaderTest3 {
    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 系统类加载器
         */
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);

        /**
         * 线程上下文加载器
         */
        System.out.println(Thread.currentThread().getContextClassLoader());

        /**
         * 3.
         */
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
    }
}
