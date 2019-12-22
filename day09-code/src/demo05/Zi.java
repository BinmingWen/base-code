package demo05;

/*
super和this关键子用来访问本类内容。用法也有三种
1.本类中的成员方法中，访问本类的成员变量。
2.在本类的成员方法中，访问本类的另一个成员变量。
2.本类的构造方法中，访问本类的另一个构造方法
this和super在构造方法中具有唯一性，且二者不能同时使用。
 */
public class Zi extends Fu {
    int num;
    public Zi() {
        //super();
        super(20);
        //this(22);
        System.out.println("子类构造方法");
    }
    public Zi(int a){
       // this();
    }
    public Zi(int a,int b){
        //this();

    }
    public void method(){
        System.out.println(this.num);
    }

}
