package Demo01MyFunctionalInterface;

public class Demo01MyFunctional {
    public static void main(String[] args) {
        //使用实现类
        show(new MyFunctionalInterfaceImple());
        //匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类");
            }
        });
        //使用Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式");
        });
        //简化Lambda表达时
        show(() -> System.out.println("使用简化的lambda表达时"));
    }

    public static void show(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method();
    }
}
