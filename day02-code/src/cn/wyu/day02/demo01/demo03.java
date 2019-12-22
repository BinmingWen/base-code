package cn.wyu.day02.demo01;

public class demo03 {
    public static void main(String[] args) {

        int num = getSum(10,20);
        System.out.println("结果为："+num);
        System.out.println("=====");
        printSum(10,20);

    }
    //返回两个数相加
    public static int getSum(int a,int b){
        int result = a+b;
        return result;
    }
    //两数相加，没有返回值
    public static void printSum(int a,int b){
        int result = a+b;
        System.out.println("结果为："+result);
    }
}
