package com.example.jvm.stack;

public class Son extends Father {

    private void test() {
        // invokevirtual
        // 因为此方法声明有final，不能被子类重写，所以也人为此方法是非虚方法
        showFinal();
        // invokespecial
        super.showFinal();
        MethodInterface methodInterface = null;
        methodInterface.hello();
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father {

    public final void showFinal() {
        System.out.println("father final");
    }
}

interface MethodInterface {

    void hello();

}
