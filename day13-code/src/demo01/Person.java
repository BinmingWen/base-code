package demo01;
/*
1.final关键字，要么直接赋值，要么就通过构造方法直接赋值，二者选其一，不能两者同时进行
2.使用final成员变量，不在提供默认值。
 */
public class Person {
    private final String name;
    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "李莉";
    }




}
