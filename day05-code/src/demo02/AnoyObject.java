package demo02;

import java.util.Scanner;

public class AnoyObject {
    public static void main(String[] args) {
        //普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //匿名对象的方式
        int num2 = new Scanner(System.in).nextInt();

        //使用一般方法传入参数
        methodParame(sc);

        //使用匿名类传入参数
        methodParame(new Scanner(System.in));

        //放回对象引用
        Scanner sc2 = methodParame();
        int num3 = sc2.nextInt();
        System.out.println(num3);

    }

    private static Scanner methodParame() {
        return new Scanner(System.in);
    }

    private static void methodParame(Scanner sc) {

        int num = sc.nextInt();
        System.out.println(num);
    }
}
