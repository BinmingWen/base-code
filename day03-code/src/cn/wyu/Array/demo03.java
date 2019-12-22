package cn.wyu.Array;

public class demo03 {
    public static void main(String[] args) {
        //动态初始化
        int []array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[1] = 11;
        System.out.println(array[1]);
    }
}
