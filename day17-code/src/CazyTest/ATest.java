package CazyTest;

interface A{
    void test();
}

public class ATest {
    public static void main(String[] args) {
        int age = 8;
       //age = 33;
        A a = new A() {
            @Override
            public void test() {
                System.out.println("年龄为："+age);
            }
        };
    }

}
