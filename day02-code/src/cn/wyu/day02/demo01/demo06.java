package cn.wyu.day02.demo01;

public class demo06 {
    //打印指定次数的Hello word
    public static void main(String[] args) {

        printHelloWord(10);
    }
    public static void printHelloWord(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!"+(i+1));
        }
    }
}
