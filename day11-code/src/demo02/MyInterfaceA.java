package demo02;

public interface MyInterfaceA {
    public void methodA();
    public default void method() {
        System.out.println("默认方法A");
    }
}
