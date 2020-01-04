package demo02;

public abstract class MyInterface implements MyInterfaceA,MyInterfaceB {

    @Override
    public void method() {
        System.out.println("重写默认方法");
    }
}
