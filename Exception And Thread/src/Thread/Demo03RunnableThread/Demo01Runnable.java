package Thread.Demo03RunnableThread;

public class Demo01Runnable {
    public static void main(String[] args) {
        //3.创建一个Runnable接口的实现类对象
        RunnableImple r = new RunnableImple();
        //4.创建Thread对象，构造方法中传递Runnable接口的实现类对象
        Thread rd = new Thread(r);
        //5.调用start方法，并执行run方法
        rd.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
