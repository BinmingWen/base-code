package demo01;

public interface MyInterfacePrivate {
    public default  void mehtodA() {
        System.out.println("默认方法1");
        comment();
    }
    public default void methodB() {
        System.out.println("默认方法2");
        comment();
    }
    private void comment() {
        System.out.println("AAA");
        System.out.println("BBB");
    }
}
