package com.example.jvm.string;

/**
 * @author: leite
 * @date: 2020/12/24 20:16
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop"; // 编译器优化
        // 如果拼接出现变量，则会在对空间中new String(),
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 = s4);
        System.out.println(s3 = s5);
        System.out.println(s3 = s6);
        System.out.println(s3 = s7);
        System.out.println(s5 = s6);
        System.out.println(s5 = s7);
        System.out.println(s6 = s7);


        String s8 = s6.intern();
        System.out.println(s3 = s8);
    }

    private void test5(){
        System.out.println();
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }

    private void test() {
        String a = "a";
        String b = "b";
        /*
       a + b的执行细节
       1.StringBuilder sb = new StringBuilder();
       2. sb.append("a");
       3. sb.append("b");
       4. sb.toString(); --> 类似于 new String("ab");
         */
        String c = a + b;
    }


    /**
     * 1.字符串拼接操作不一定使用的StringBuilder！
     * 如果拼接符号左右两边都是字符串常量或常量引用，则仍然使用编译器优化
     * 2.针对于final修饰类、方法、基本数据类型、引用数据类型的量的结构时，能使用final建议使用上
     */
    private void test2() {
        final String a = "a";
        final String b = "b";
        String s1 = "ab";
        String ab = a + b;
        // true
        System.out.println(ab == s1);
    }

    /**
     * 通过StringBuilder的append()的方式添加字符的效率要高于使用String的字符串拼接方式
     * StringBuilder自始至终都只创建了一个StringBuilder
     */
}
