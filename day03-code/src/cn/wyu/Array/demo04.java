package cn.wyu.Array;

public class demo04 {
    public static void main(String[] args) {
        int[] array = {5,7,8,1000,888,33};
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
