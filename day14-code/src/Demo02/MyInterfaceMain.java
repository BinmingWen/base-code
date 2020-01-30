package Demo02;

public class MyInterfaceMain {
    public static void main(String[] args) {
        //通过实现类来实现调用函数。
        MyInterface imple = new MyInterfaceImple();
        imple.method();

        System.out.println("========");
        /*//匿名对象
        new MyInterface(){

            @Override
            public void method() {
                System.out.println("实现方法1");
            }
        }.method();*/

        System.out.println("=======");
        //匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("实现方法1");
            }
        };
        myInterface.method();
    }
}
