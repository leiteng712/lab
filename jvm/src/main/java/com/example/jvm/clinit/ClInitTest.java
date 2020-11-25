package com.example.jvm.clinit;

/**
 * 1.<clinit>方法是javac编译器自动收集类中的
 * 所有类变量的赋值动作 和
 * 静态代码块中的语句
 * 合并而来
 * 2.JVM会保证子类<clinit>执行前，父类的<clinit>已经执行完毕

 * ByteCode Viewer 查看java类字节码
 */
public class ClInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        // 非法前向引用
        // System.out.println(number);
    }

    // linking -> prepare 0 -> initializing -> 20 -> 10
    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(number);
    }
}
