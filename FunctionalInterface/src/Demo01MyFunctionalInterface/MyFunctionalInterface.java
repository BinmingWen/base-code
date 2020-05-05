package Demo01MyFunctionalInterface;

//函数式接口
@FunctionalInterface
public interface MyFunctionalInterface {
    //void method();
    public abstract void method();
    default void test(){
        System.out.println("默认方法");

    }
    private static void staticMethod(){}

}
