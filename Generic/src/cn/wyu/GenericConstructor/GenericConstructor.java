package cn.wyu.GenericConstructor;

public class GenericConstructor {
    public static void main(String[] args) {
        new Foo("疯狂Java讲义");
        new Foo(200);
        new <String>Foo("疯狂Android讲义");
        //new <Stirng>Foo(222);
    }
}
