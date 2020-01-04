package demo03;

public interface MyInterfaceA {
    public static final int NUM = 10;
    public abstract void methodA();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("AAA");
    }
    public static void methodStatic(){
        System.out.println("静态方法");
    }
}
