package demo01;

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的int数字是："+num);

        //4.从键盘获取输入的字符串
        String str = sc.next();

    }
}
