package Thread.BlockingQueue;

import java.util.Properties;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{"Java", "Struts", "Spring"};
        for (int i = 0; i < 99999; i++) {
            System.out.println(getName() + "生产者准备生产集合元素！");
            try {
                Thread.sleep(200);
                bq.put(strArr[i%3]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"生产完成："+bq);

        }
    }
}
