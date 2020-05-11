package cn.wyu.GenericConstructor;

public class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}
