package demo01;

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void methodA() {
        System.out.println("调用抽象方法AAAAA");
    }

    @Override
    public void methodB() {
        System.out.println("重写默认方法AAA");
    }
}
