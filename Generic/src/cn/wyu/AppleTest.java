package cn.wyu;

public class AppleTest {
    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());
        Apple<Double> a2 = new Apple<>(4.3);
        System.out.println(a2.getInfo());
    }
}
