package cn.wyu.Array;

public class demo01 {
    public static void main(String[] args) {
        //静态初始化数据元素
        int arrayA[] = new int[]{12, 33, 44};

        //动态初始化函数
        int arrayB[] = new int[4];

        //拆开动态初始化函数写法
        int arrayC[];
        arrayC = new int[5];

        //拆开静态初始化函数写法，省略写法
        int arrayD[];
        arrayD = new int[]{11,22,33};

        int arrayE[] = {11, 22, 33, 44};
    }

}
