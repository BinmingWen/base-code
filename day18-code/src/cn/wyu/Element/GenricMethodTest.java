package cn.wyu.Element;

public class GenricMethodTest {
    public static void main(String[] args) {
        GenricMethod gm = new GenricMethod();
        gm.method01("abc");
        gm.method01(11);
        gm.method01(44);

        System.out.println("======");
        GenricMethod.method02("加以一");
    }
}
