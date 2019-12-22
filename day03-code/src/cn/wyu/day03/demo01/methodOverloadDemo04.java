package cn.wyu.day03.demo01;

/*
打印输出所有不同类型的参数类型数据
 */
public class methodOverloadDemo04 {
    public static void main(String[] args) {

        println(2);
        println(33.3);
    }
    public static void println(byte a) {
        System.out.println(a);
    }
    public static void println(char a){
        System.out.println(a);
    }
    public static void println(int a) {
        System.out.println(a);
    }
    public static void println(long a) {
        System.out.println(a);

    }
    public static void println(double a){
        System.out.println(a);
    }
    public static void println(float a) {
        System.out.println(a);
    }
}
