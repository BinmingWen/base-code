package demo02;

public interface MyInterfaceB {
    public void methodB();
    public default void method(){
        System.out.println("默认方法B");
    }
}
