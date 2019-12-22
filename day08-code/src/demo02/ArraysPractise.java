package demo02;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {
        String str = "asv76agfssdfhj";
        char[] arrStr = str.toCharArray();
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
        for (int i = arrStr.length-1; i >=0; i--) {
            System.out.print(arrStr[i]);

        }
        System.out.println();
    }
}
