package Demo05;

public class MyClass {
    public static int num;
    public String name;

    static {
        num = 10;
       // name = "李佳";
    }
    {
        num = 22;
        name = "刘佳";
    }
}
