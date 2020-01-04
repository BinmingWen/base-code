package demo03;

//这是注释的发信息
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("继承默认方法！");
    }
}
