package cn.wyu.Objection;

public class PhoneReturn {
    public static void main(String[] args) {

        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "小米8";
        one.price = 1111.2;
        one.color = "黑色";
        return one;
    }
}
