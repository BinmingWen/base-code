package demo02;

import java.util.Arrays;

public class demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {101,221,33};
        String str = Arrays.toString(intArray);
        //System.out.println(intArray.toString());
        String[] stringArr = {"aaa","ccc","b"};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(stringArr);
       // System.out.println(A);
        System.out.println(Arrays.toString(stringArr));
        System.out.println(str);
    }

}
