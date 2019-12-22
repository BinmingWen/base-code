package demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    //求三个书中的最大值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        /*int c;
        while(sc.hasNextInt()){
            c = sc.nextInt();
            System.out.println(c);
        }*/
        String str = sc.nextLine();
        System.out.println(str);

       /* //找出最大值
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println("最大值为："+max);*/
    }
}
