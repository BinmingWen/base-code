package Demo02;

/*
内部类访问的成员变量为不可改变的常量，或者final声明的常量
 */
public class MyOut {
    public void methodOuter() {
        final int num = 10;
        class MyInner{
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
