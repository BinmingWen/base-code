package cn.wyu.AnnoTest;

public class Calculator {
    //加
    @Check
    public void add(){
        System.out.println("1+1= "+(1+1));
    }
    //减
    @Check
    public void subtract(){
        System.out.println("1-1= "+(1-1));

    }

    //乘
    @Check
    public void divide() {
        int c = 1/0;
        System.out.println("1/1= " + (1 / 1));
    }
    //除
    @Check
    public void multiply(){
        System.out.println("1*1= "+(1*1));

    }
    public void show(){
        System.out.println("你好啊。。。。。");
    }

}
