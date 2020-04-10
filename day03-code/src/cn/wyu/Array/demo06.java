package cn.wyu.Array;

/*
数组反转：
【1，2，3，4】
【4，3，2，1】
 */
public class
demo06 {

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        //遍历数组原来的样子
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("============");

        //反转
        for (int min=0,max=array.length-1;min<max;min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;

        }
        //再次遍历输出，反转后的数组元素
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
