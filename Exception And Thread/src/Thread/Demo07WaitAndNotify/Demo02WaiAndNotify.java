package Thread.Demo07WaitAndNotify;

public class Demo02WaiAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        //创建顾客消费者，购买包子
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客选择包子的类型和数量");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("开吃了！");
                }
            }
        }.start();
        //创建老板线程，制作包子
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                       // System.out.println("包子制作中。。。。");
                        try {
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("你的包子已经做好了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
