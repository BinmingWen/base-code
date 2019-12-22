package demo02;

import java.util.Random;

public class demo04Random {
    public static void main(String[] args) {
        int n=5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //范围从[0,n)，变为[1,n]
            int result = r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
