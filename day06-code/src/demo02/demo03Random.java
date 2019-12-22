package demo02;

import java.util.Random;

public class demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);   //左闭右开区间，0~10
            System.out.println(num);
        }
    }
}
