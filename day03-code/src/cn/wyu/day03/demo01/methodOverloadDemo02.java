package cn.wyu.day03.demo01;

/*
比较不同数据类型的参数
 */
public class methodOverloadDemo02 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 3;
        short c = 3;
        short d = 3;
        char e = 'A';
        char f = 'A';
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));

    }
    public static boolean compare(byte a,byte b){
        System.out.println("调用的是byte");
        return a==b;


    }
    public static boolean compare(short a,short b){
        System.out.println("调用的是short");
        return a==b;
    }
    public static boolean compare(char a,char b){
        System.out.println("调用的是char");
        return a==b;
    }

}
