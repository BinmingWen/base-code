package demo03;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("BBB");
    }
}
