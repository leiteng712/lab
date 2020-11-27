package com.example.jvm.classloader;


/**
 * 双亲委派机制
 * 1.加载类委托给父类加载器
 * 2.向上委托
 * 3.如果父类加载器完成类加载任务，就成功返回，
 * 如果父类加载器无法完成加载任务，子类才会尝试自己去加载
 * <p>
 * 优势：
 * 1.避免类的重复加载
 * 2.防止核心API被随意篡改
 * <p>
 * JVM中两个class对象为同一个类的必要条件：
 * 1.类的完整名称必须一致，包括包名（全限定名）
 * 2.加载这个类的classloader必须相同
 * 一个类由用户类加载器，那么JVM会将这个类加载器的一个引用作为类型信息的一部分保存在方法区
 *
 * Java程序对类的使用方式：主动使用和被动使用（区别：是否会导致类的初始化）
 */
public class ClassLoaderTest4 {
    public static void main(String[] args) {
        java.lang.String s = new java.lang.String();
    }
}
