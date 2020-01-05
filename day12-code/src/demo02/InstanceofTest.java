package demo02;

import java.util.List;

/*

boolean result = obj instanceof Class
1.obj是Class的子类，直接或者间接实现类，
2.obj是Class的接口实现类，
3.obj不为null，并且obj可以转化成Class，不报ClassCastException错误。
 */
public class InstanceofTest {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof Object);
        MyInterfaceImple imple = new MyInterfaceImple();
        System.out.println(imple instanceof MyInterface);
        System.out.println("=======");
        System.out.println(imple instanceof List);
        System.out.println("========");
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(c instanceof A);
    }
}
