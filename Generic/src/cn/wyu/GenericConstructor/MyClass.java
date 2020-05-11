package cn.wyu.GenericConstructor;

public class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("t参数的值为："+t);
    }
}
