package demo01;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.method();

        obj.methodStatic();
        Myclass.methodStatic();
    }
}
