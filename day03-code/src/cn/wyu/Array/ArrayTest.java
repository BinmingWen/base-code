package cn.wyu.Array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //定义一个数组
        int[] a = {3, 4, 5, 6};
        int[] a2 = {3, 4, 5, 6};

        //比较数组a是否等于a2
        System.out.println("a数组是否与a2数组相等：" + Arrays.equals(a, a2));

        //把a数组复制给b数组
        int[] b = Arrays.copyOf(a,6);
        System.out.println("a数组是否与b数组相等："+Arrays.equals(a,b));

        //输出b数组的元素
        System.out.println(Arrays.toString(b));

        //替换b数组中的2、4元素
        Arrays.fill(b,2,4,1);
        System.out.println(Arrays.toString(b));

        //对b数组进行排序
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(b,4));

        System.arraycopy(a,0,b,0,4);
        System.out.println(Arrays.toString(b));
    }
}
