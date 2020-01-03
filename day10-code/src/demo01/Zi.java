package demo01;

public class Zi extends Fu{
    public Zi() {
        System.out.println("子类构造方法的执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃放了！");
    }

}
