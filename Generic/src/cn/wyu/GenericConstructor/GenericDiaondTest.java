package cn.wyu.GenericConstructor;

public class GenericDiaondTest {
    MyClass<String> mc1 = new MyClass<String>(6);
    MyClass<String> mc2 = new <Integer>MyClass<String>(6);
    MyClass<String> mc3 = new MyClass<>(6);

}
