package cn.wyu.Objection;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();

        //调用成员变量
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        System.out.println("==============");
        //初始化成员变量
        phone.brand="小米";
        phone.price=123.4;
        phone.color="黑色";

        //调用成员变量
        System.out.println("品牌: "+phone.brand);
        System.out.println("价格: "+phone.price);
        System.out.println("颜色: "+phone.color);

        //调用成员方法
        phone.call("雷军");
        phone.sendMessage();

        System.out.println("==============");
        Phone two = new Phone();
        two.brand = "华为";
        two.price = 8848.0;
        two.color = "黄色";

        //调用成员变量
        System.out.println("品牌: "+two.brand);
        System.out.println("价格: "+two.price);
        System.out.println("颜色: "+two.color);

        //调用成员方法
        phone.call("任正非");
        phone.sendMessage();

    }
}
