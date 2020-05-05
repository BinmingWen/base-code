package cn.wyu.Ano;

/**
 * 注解javadoc演示
 *
 * @author wen
 * @version 1.0
 * @since 1.8
 */
public class Student {
    private String name;
    private int age;

    /**
     * 计算两数之和
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    public int add(int a, int b) {
        return a+b;
    }
}
