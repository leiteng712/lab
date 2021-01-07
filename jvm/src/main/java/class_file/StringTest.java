package class_file;

/**
 * @author: leite
 * @date: 2021/1/7 9:42
 */
public class StringTest {

    public static void main(String[] args) {
        String str = new String("hello") + new String("world");
        String str1 = "helloworld";
        String str2 = new String("helloworld").intern();
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str1 == str2);
    }
}
