package Thread.ThreadDemo;

public class Baozipu extends Thread {
    Baozi bz;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //包子类型
        int count = 0;
        while (true) {
            synchronized (bz) {
                //当前有包子，包子铺不生产包子
                if (bz.isFlag()) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.setPi("薄皮");
                    bz.setXian("豆沙");
                } else {
                    bz.setPi("冰皮");
                    bz.setXian("猪肉");
                }
                bz.setFlag(true);
                count++;
                System.out.println("顾客你的" + bz.getPi() + bz.getXian() + "包子做好了，请慢用！");
                //唤醒吃货吃包子
                bz.notify();
            }
        }
    }
}
