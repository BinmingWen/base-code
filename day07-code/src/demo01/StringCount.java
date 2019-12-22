package demo01;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();

        int countUpper = 0;   //大学字母
        int countLower = 0;   //小写字母
        int countNum = 0;     //数字
        int countOther = 0;   //其他

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i] <='Z'){
                countUpper++;
            }
            else if(chars[i] >='a' && chars[i] <='z') {
                countLower++;
            }
            else if(chars[i] >= '0' && chars[i] <= '9'){
                countNum++;
            }
            else{
                countOther++;
            }

        }
        System.out.println("大写字母的个数为："+countUpper);
        System.out.println("小写字母的个数为："+countLower);
        System.out.println("数字的个数为："+countNum);
        System.out.println("其他字母的个数为："+countOther);
    }
}
