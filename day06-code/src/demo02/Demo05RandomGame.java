package demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo05RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;  //[1,100]
        Scanner sc = new Scanner(System.in);
        int count=3;
        while(count >0){
            System.out.printf("你还有%d次机会\n",count);
            System.out.println("请输入猜测的数字：");

            int num = sc.nextInt();
            count--;
            if(randomNum > num) {
                System.out.println("太小了，请重试");
            }
            else if(randomNum < num) {
                System.out.println("太大了，请重试");
            }
            else{
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
