package cn.wyu.day02.demo01;

public class demo04 {
    /*
    判断两个数是否相等
     */
    public static void main(String[] args) {

        System.out.println(isSame(10,33));
    }

    public static boolean isSame(int a,int b) {
      /*  //方法一：
        boolean same;
        if(a==b) {
            same = true;
        }
        else{
            same=false;
        }
        return same;

        //方法二
        same = a==b?true:false;
        */
        //方法三
        return a==b;
    }
}
