package demo01;

public class Person {
    static {
        System.out.println("执行静态代码块！");
    }
    public Person() {
        System.out.println("执行构造方法！");
    }
}
