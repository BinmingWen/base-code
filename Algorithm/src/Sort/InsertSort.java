package Sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int a[] = new int[]{79,35,85,100};
        insertSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void insertSort(int[] a, int start, int end) {
        for (int i = 1; i < end; i++) {
            int temp = a[i];
            int j = i-1;
            for (; j >= 0 && a[j] - temp > 0; j--) {
                //数据后移
                a[j+1] = a[j];

            }
            a[j+1] = temp;

        }
        /*int temp = a[start];
        int j = start+1;
        for(j=>0;a[j];j--){
            //当前数据后移
            a[j++] = a[j];
        }
        a[j] = temp;*/






    }
}
