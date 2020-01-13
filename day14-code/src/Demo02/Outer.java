package Demo02;
//局部内部类
/*
类的权限修饰符：
public > protected >(default) > private
外部类：public /(default)
成员内部类：public /protected /default/private
局部内部类什么都不写。
 */
class Outer {
    public void methodOuter() {
        class Inner{
            int num = 10;

            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
