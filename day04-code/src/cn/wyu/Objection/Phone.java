package cn.wyu.Objection;
//定义一个手机类
public class Phone {
    //成员变量
    String brand;   //品牌
    double price;   //价格//定义一个手机类
    String color;   //颜色
    //成员方法
    public void call(String who){
        System.out.println("打电话给："+who);
    }
    public void sendMessage() {
        System.out.println("群发信息");
    }
}
