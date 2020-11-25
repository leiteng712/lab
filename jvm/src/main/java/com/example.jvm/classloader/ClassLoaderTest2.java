package com.light.classloader;

import sun.misc.Launcher;
import sun.security.ec.point.Point;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        /**
         * 引导类加载器
         */
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        System.out.println(Provider.class.getClassLoader());

        /**
         * 扩展类加载器
         */
        String extDirs = System.getProperty("java.ext.dirs");
        String[] split = extDirs.split(";");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println(Point.class.getClassLoader());
    }
}
