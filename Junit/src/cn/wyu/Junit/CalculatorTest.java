package cn.wyu.Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add = cal.add(1, 2);
        System.out.println(add);
        int result = cal.sub(1, 2);
        System.out.println(result);
    }
}
