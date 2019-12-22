package cn.wyu.Objection;

public class PhoneParam {
    public static void main(String[] args) {

        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 3333.4;
        one.color = "土豪金";
        method(one);
    }
    public static void method(Phone param) {
        System.out.println("品牌："+param.brand);
        System.out.println("价格："+param.price);
        System.out.println("颜色："+param.color);


    }
}
