package cn.wyu.day03.demo01;

/*
方法重载：参数列表的个数不同
1.参数类型不同，
2.不同类型参数顺序
3.参数个数不同

注意：
方法重载与返回值类型无关，
 */
public class methodOverDemo01 {
    public static void main(String[] args) {

        System.out.println(sum(22,3));
        System.out.println(sum(1,3,3));
        System.out.println(sum(11,3.3));
    }
    public static int sum(int a,int b){
        return a+b;
    }
/*    public static void sum(int a,int b){
        return a+b;
    }*/
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

}
