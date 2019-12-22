package cn.wyu.This;

public class Student {
    private String name;
    private int age;

    public Student() {

        System.out.println("调用无参的构造函数");
    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用有参的构造函数");
    }
}
