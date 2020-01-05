package demo02;

public interface MyInterface {
    public default void methodA() {
        System.out.println("AAAAAAA");
        comment();
    }
    public static void mehtodB() {
        System.out.println("Static method");

    }
    private void comment() {
        System.out.println("私有方法的实现");
    }
}
