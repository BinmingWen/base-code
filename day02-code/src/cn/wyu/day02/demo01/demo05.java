package cn.wyu.day02.demo01;

public class demo05 {
    //求输出1-100之间的和
    public static void main(String[] args) {
        System.out.println("结果为："+getSum());
    }

    public static int getSum(){
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
