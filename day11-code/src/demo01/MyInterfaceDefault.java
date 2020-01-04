package demo01;

/*
jdk1.8新增加类接口的默认方法
 */
public interface MyInterfaceDefault {
    void methodA();
    public default void methodB() {
        System.out.println("默认方法！");
    }


}
