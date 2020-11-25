package com.light.classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {

        /**
         * 1.负责加载坏境变量classpath或系统属性java.class.path指定路径下的类库
         * 2.程序默认加载器，一般来说Java应用的类都是由它来完成加载
         */
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(systemClassLoader);

        /**
         * 1.Java语言编写
         * 2.派生于ClassLoader类
         * 3.父类加载器为启动类加载器
         * 4.从java.ext.dirs系统属性所指定的目录中加载类库
         *  或从jdk安装目录的jre/lib/ext子目录下加载类库
         *  如果用户创建的JAR放在此目录下，也会自动由扩展类加载器加载
         */
        ClassLoader extClassLoader = systemClassLoader.getParent();
        // sun.misc.Launcher$ExtClassLoader@1b6d3586
        System.out.println(extClassLoader);

        /**
         * 1.c/C++语言实现
         * 2.加载java核心类库
         * 3.加载扩展类和应用程序类加载器，并指定为他们的父类加载器
         * 4.出于安全的考虑，Bootstrap启动类加载器只加载包为java、javax、sun开头的类
         */
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        // null
        System.out.println(bootstrapClassLoader);


        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader);

        ClassLoader classLoader1 = String.class.getClassLoader();
        // null
        System.out.println(classLoader1);
    }
}
