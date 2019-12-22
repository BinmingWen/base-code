package demo01;

public class Myclass {
    private int num;
    private static
    int numStatic;
    public void method(){
        //非静态可以访问，静态和非静态
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println("这是成员方法");
    }
    public static void methodStatic() {
        //静态方法只能访问静态。
        //System.out.println(num);
        System.out.println(numStatic);
        System.out.println("这是静态方法");
    }
}
