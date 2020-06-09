package Thread.DeadLock;

public class B {
    public synchronized void bar(A a) {
        System.out.println("当前线程名："+Thread.currentThread().getName()+
                " 进入B实例的bar方法");
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+
                " 企图调用A实例的last()方法");
        a.last();
    }
    public synchronized void last(){
        System.out.println("进入B类的last方法内部");
    }
}
