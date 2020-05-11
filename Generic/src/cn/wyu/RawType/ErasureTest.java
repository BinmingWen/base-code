package cn.wyu.RawType;

public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<>(6);
        Integer as = a.getSize();
        Apple b = a;
        System.out.println(b.getSize());
        Number num = b.getSize();

    }
}
