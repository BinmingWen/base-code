package cn.wyu.Variable;

public class Demo02Method {
    public static void main(String[] args) {

        int[] array = new int[]{10,20,30,100};
        int max = getMax(array);
        System.out.println("数组的最大值为："+max);
    }
    public static int getMax(int []array) {
        int max = array[0];
        for(int i=0;i<array.length;i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
