package cn.wyu.Element;
/*
子类继承接口的时候，可以同时指定接口的泛型类型
 */
public class GenericImple implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
