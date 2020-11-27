package java.lang;

/**
 * 沙箱安全机制 保证对Java核心源代码的保护
 */
public class String {
    public static void main(String[] args) {
        System.out.println("看不到");
    }

    // 初始化阶段调用
    {
        System.out.println("我是自定义类的静态代码块");
    }
}
