package cn.wyu.day02.demo01;

public class demo02 {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("======");

        //赋值调用
        int number =  sum(10,2);
        System.out.println("变量的值："+number);

        //打印调用
        System.out.println( sum(10,15));
    }

    //两数相加,并返回结果。
    public static int sum(int a,int b) {
        int result = a+b;
        return result;
    }
}
