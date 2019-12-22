package demo05;

/**
 * 1.子类构造方法当中有一个默认隐含的“super”调用，所以一定要先调用的父类构造方法，后执行子类的构造方法
 * 2.子类构造可以通过super关键字来调用父类重载构造
 * 3.super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
 */
public class Demo01Contructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
