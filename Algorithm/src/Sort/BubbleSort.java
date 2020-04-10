package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{79,35,85,100,8};
        bubbleSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a, int start, int end) {
        for (int i = 0; i < end-1; i++) {
            for (int j = 0; j < end-i-1; j++) {
                if (a[j+1] < a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
