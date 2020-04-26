package Thread.Demo02ThreadMethod;

public class MyThreadNameTest {
    public static void main(String[] args) {
        MyThreadName mtName = new MyThreadName();
        mtName.setName("小强");
        mtName.start();
        System.out.println("========");
        new MyThreadName("小红").start();
    }
}
