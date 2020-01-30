package cn.wyu.ForEach;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //ForEach循坏遍历集合
        for (String str:list) {
            System.out.println(str);
        }
        System.out.println("==========");
        //遍历数组
        int[] arr = {1, 23, 4, 5,};
        for (int a : arr) {
            System.out.println(a);
        }
        String[] str = list.toArray(new String[20]);
        for (String s : str) {
            System.out.println(s);
        }

    }
}
