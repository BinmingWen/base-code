package CazyTest;

public class LocalInnerClass {
    public static void main(String[] args) {
        class InnerBase {
            int a;
        }
        class InnerSub extends InnerBase {
            int b;
        }
        //创建局部内部类的对象
        InnerSub sub = new InnerSub();
        sub.a = 6;
        sub.b = 9;
        System.out.println("InnerSub对象a和b实例变量是："+sub.a+sub.b);
    }
}
