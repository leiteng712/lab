package com.example.jvm.clinit;

/**
 *  * 3.JVM必须保证一个类的<clinit>方法在多线程下被同步加锁
 */
public class ClInitTest2 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            HelloWorld helloWorld = new HelloWorld();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread t1 = new Thread(r, "A线程");
        Thread t2 = new Thread(r, "B线程");
        t1.start();
        t2.start();
    }

}

class HelloWorld {
    static {
        System.out.println(Thread.currentThread().getName() + "初始化HelloWorld");
    }
}