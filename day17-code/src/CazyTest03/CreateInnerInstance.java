package CazyTest03;

public class CreateInnerInstance {
    public static void main(String[] args) {
        //Out.in inner = new Out().new in("测试信息");
        Out.in inner;
        Out out = new Out();
        inner = out.new in("测试信息");
    }
}
