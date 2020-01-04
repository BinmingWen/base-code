package demo01;

public class Demo01InterfaceDefault {
    public static void main(String[] args) {
        MyInterfaceDefaultA myInterfaceDefaultA = new MyInterfaceDefaultA();
        myInterfaceDefaultA.methodA();
        myInterfaceDefaultA.methodB();
        System.out.println("=========");

        MyInterfaceDefaultB myInterfaceDefaultB = new MyInterfaceDefaultB();
        myInterfaceDefaultB.methodA();
        myInterfaceDefaultB.methodB();
    }
}
