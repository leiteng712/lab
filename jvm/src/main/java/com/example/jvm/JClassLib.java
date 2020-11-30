package com.example.jvm;

public class JClassLib {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int a = i + j;
    }

    public int test() {
        int i = 1;
        {
            int l = 0;
            l = l + i;
        }
        double weight = 118.9;
        JClassLib jClassLib = new JClassLib();
        return i;
    }

}
