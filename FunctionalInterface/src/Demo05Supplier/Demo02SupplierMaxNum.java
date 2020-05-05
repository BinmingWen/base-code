package Demo05Supplier;

import java.util.function.Supplier;

public class Demo02SupplierMaxNum {
    public static int maxNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -1, 300, 250};
        int temp = maxNumber(()->{
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        int t = maxNumber(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int max = arr[0];
                for (int i : arr) {
                    if (i > max) {
                        max = i;
                    }
                }
                return max;
            }
        });
        System.out.println("最大值为："+t);
        System.out.println("最大值为："+temp);
    }
}
