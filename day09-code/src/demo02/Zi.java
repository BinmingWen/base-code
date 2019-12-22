package demo02;

public class Zi extends Fu{
    int numZi = 20;
    int num = 200;
    /*public void method(){
        int num = 300;
        System.out.println(num);   //300
        System.out.println(this.num);  //200;
        System.out.println(super.num); //100
    }*/
    public void methodZi(){
        System.out.println("子类执行方法！");
    }
    public void method() {
        System.out.println("子类重写方法");
    }
}
