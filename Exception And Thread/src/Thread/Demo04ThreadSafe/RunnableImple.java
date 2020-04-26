package Thread.Demo04ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImple implements Runnable{

    //100张票在售卖
    int ticket = 100;
    //创建一个锁对象
    Object obj = new Object();
    Lock l = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            //同步代码块
            l.lock();
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + "正在售卖" + ticket + "张票");
                    ticket--;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                l.unlock();
            }

        }
    }
}
