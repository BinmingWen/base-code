package demo02;

public class MyInterfaceImple implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("方法A");
    }

    @Override
    public void method() {
        System.out.println("默认方法");
    }

    @Override
    public void methodB() {
        System.out.println("方法B");

    }
}
