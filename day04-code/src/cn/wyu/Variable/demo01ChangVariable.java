package cn.wyu.Variable;

public class demo01ChangVariable {
    String name;    //成员变量，初始化值为null
    public void test(int price) {
        System.out.println(price);
        System.out.println(name);
    }
    public static void method01() {
        int num;
       // System.out.println(num);   //局部变量，要初始值，才能使用
    }
}
