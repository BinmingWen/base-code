package demo01;

public class Demo01InterfaceStatic {
    public static void main(String[] args) {
        //直接调用
        MyInterfaceStatic.method();
        //错误写法
        MyInterfaceStaticImple myInterfaceStaticImple = new MyInterfaceStaticImple();
        //myInterfaceStaticImple.method();
    }
}
