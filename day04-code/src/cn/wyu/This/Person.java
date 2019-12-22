package cn.wyu.This;

public class Person {
    String name;    //名称
    public void show(String name) {
        System.out.println(name+",你好我叫："+name);
        System.out.println(this);
    }
}
