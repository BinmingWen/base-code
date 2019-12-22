package demo02;

import java.util.Random;

public class demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
