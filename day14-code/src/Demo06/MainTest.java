package Demo06;

public class MainTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle("黑色", 3, 4, 5);
        Shape s2 = new Circle("黄色", 2.2);
        System.out.println(s1.calPerimeter());
        System.out.println(s1.getType());
        System.out.println(s2.calPerimeter());
        System.out.println(s2.getType());
    }

}
