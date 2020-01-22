package cn.wyu.Element;

/*
Collection
 */
public class GenricMethod {
    public <T> void method01(T t) {
        System.out.println(t);
    }

    public static <T> void method02(T t) {
        System.out.println(t);
    }
}
