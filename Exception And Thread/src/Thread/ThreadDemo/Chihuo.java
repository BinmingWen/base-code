package Thread.ThreadDemo;

public class Chihuo extends Thread {
    Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //没有包子，则等待包子铺生产包子
                if(!bz.isFlag()){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("我正在吃" + bz.getPi() + bz.getXian() + "的包子");
                System.out.println("包子已经吃完了，赶紧的生产包子！");
                System.out.println("---------------------------");
                bz.setFlag(false);
                //唤醒包子铺生产包子
                bz.notify();
            }
        }
    }
}
