package Demo01System;

import java.util.Arrays;
/*
System类的用法：
    currentTimeMillis() 获取时间毫秒数
    arraycopy() 复制数组
 */
public class Demo01System {
    public static void main(String[] args) {
       /* //程序执行前，获取一次毫秒数
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long s1 = System.currentTimeMillis();
        System.out.println("一共消耗了"+(s1-s)+"毫秒");*/
       demo02();
    }

    private static void demo02() {
        //原数组
        int[] src = {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后："+Arrays.toString(dest));
    }
}
