package cn.wyu.Element.twoGenric;

import cn.wyu.Element.GenericInterface;

/*
继承接口的泛型，使得继承类同时也是跟接口一样的泛型E
 */
public class GenericImple<E> implements GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
