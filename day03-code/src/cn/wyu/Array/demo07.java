package cn.wyu.Array;

//数组参数
public class demo07 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printArray(array);
    }
    public static void printArray(int[] array){
        //遍历数组原来的样子
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
