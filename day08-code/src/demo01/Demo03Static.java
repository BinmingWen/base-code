package demo01;

//静态代码块只被执行一次，而且，优先于构造方法，先于构造方法执行。
public class Demo03Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
