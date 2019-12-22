package demo02;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则；
    创建的对象是谁，就优先用谁，如果没有，就往上找。
 */
public class Demo03ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        zi.method();
    }
}
