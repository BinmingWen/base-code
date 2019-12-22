package cn.wyu.Array;

public class demo05 {
    public static void main(String[] args) {
        int[] array = {22,33,-1,-33,33};
        int min = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
