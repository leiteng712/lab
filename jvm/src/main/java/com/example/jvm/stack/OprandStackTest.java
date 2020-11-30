package com.example.jvm.stack;

public class OprandStackTest {

    public void test() {
        byte i = 15;
        int j = 8;
        int k = i + j;

        int m = 800;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum(){
        int i = getSum();
        int j = 10;
    }

    /**
     * i++ 额 ++i的区别
     */
    public void add(){
        // 第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;


    }
}
