package class_file;

/**
 * @author: leite
 * @date: 2021/1/6 22:38
 */
public class Father {

    public Father() {
        this.print();
        this.i = 20;
    }

    private void print() {
        System.out.println("Father.i" + i);
    }

    int i = 10;



    public static void main(String[] args) {
        /*Father f = new Father();
        System.out.println(f.i);*/
        Father f = new Son();
        System.out.println(f.i);

    }
}

class Son extends Father {
    int i = 30;

    public Son() {
        this.print();
        this.i = 40;
    }

    private void print() {
        System.out.println("Son.i" + i);
    }
}