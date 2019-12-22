package cn.wyu.Array;

//返回数组参数类型
public class demo08 {
    public static void main(String[] args) {

        int[] result = caculate(10,20,30);
        System.out.println("返回值的参数为：" + result);
        System.out.println("总数为："+result[0]);
        System.out.println("平均数为："+result[1]);
    }
    public static int[] caculate(int a,int b,int c){
        int sum = a+b+c;   //求和
        int avg = (a+b+c)/3; //平均数
        int[] array = {sum,avg};
        return array;
    }

}
