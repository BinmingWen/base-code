package demo01;

public class Outer {
    int num = 10;   //外部成员变量
    public class Inner{
        int num = 20;     //内部成员变量
        public void methodInner() {
            int num = 30;      //局部变量
            System.out.println(num);  //方法局部变量
            System.out.println(this.num); //内部类成员变量
            System.out.println(Outer.this.num);  //外部成员变量
        }
    }
}
