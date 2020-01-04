package demo01;

public interface MyInterfacePrivateStatic {
    public static final int NUM = 10;
    public static void method(){
        System.out.println("默认方法");
        comment();
    }
    private static void comment() {
        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
}
