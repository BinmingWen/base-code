package demo01;

/*
final声明的变量不可以改变
 */
public class MyClassTest {
    public static void main(String[] args) {
        final int a = 100;
        System.out.println(a);
        final int num;
        num = 300;
        System.out.println(num);
    }
}
